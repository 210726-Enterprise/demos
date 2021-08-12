import sun.misc.Lock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Heist {

    public static final int MAX_PASSWORD = 9999;

    public static void main(String[] args) {

        Random random = new Random();
        Vault vault = new Vault(random.nextInt(MAX_PASSWORD));

        List<Thread> threads = new ArrayList<>();
        threads.add(new AscendingHackerThread(vault));
        threads.add(new DescendingHackerThread(vault));
        threads.add(new PoliceThread(10, vault));

        for (Thread thread : threads){
            thread.start();
        }
    }

    private static class Vault{

        private int password;

        public Vault(int password){
            this.password = password;
        }

        public boolean isCorrectPassword(int guess){ // make this synchronized to work with locks
            try{
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return this.password == guess;
        }
    }

    private static abstract class HackerThread extends Thread{
        protected Vault vault;

        public HackerThread(Vault vault){
            this.vault = vault;

            this.setName(this.getClass().getSimpleName());
            this.setPriority(Thread.MAX_PRIORITY);
        }

        public void start(){
            System.out.println("Starting thread: " + this.getName());
            super.start();
        }
    }

    private static class AscendingHackerThread extends HackerThread{

        public AscendingHackerThread(Vault vault) {
            super(vault);
        }

        // start at 0, then increment until our guess is correct
        public void run(){
            for(int guess = 0; guess < MAX_PASSWORD; guess++){

                if(vault.isCorrectPassword(guess)){
                    System.out.println(this.getName() + " guessed the password: " + guess);
                    System.exit(0);
                }

            }
        }
    }

    private static class DescendingHackerThread extends HackerThread{

        public DescendingHackerThread(Vault vault) {
            super(vault);
        }

        // start at 0, then increment until our guess is correct
        public void run(){
            for(int guess = MAX_PASSWORD - 1; guess >= 0; guess--){

                if(vault.isCorrectPassword(guess)){
                    System.out.println(this.getName() + " guessed the password: " + guess);
                    System.exit(0);
                }
            }
        }
    }

    private static class PoliceThread extends Thread{

        private final int SECONDS;
        private final Vault vault;

        public PoliceThread(int seconds, Vault vault){
            SECONDS = seconds;
            this.vault = vault;
        }

        @Override
        public void run(){
            // count the number of seconds until GAME OVER for the Hackers
            for(int i = SECONDS; i > 0; i--){
                try{
                    Thread.sleep(1200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(i + " seconds left.");
            }

            System.out.println("Game Over Hackers!!!!");
            System.out.println("The password was: " + vault.password);
            System.exit(0);
        }
    }
}
