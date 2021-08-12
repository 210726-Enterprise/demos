public class Driver {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());

        // There are two ways that we can create threads:
        // 1) Implement the Runnable interface and pass it to a new Thread object.
        // 2) Extend the Thread class and implement the run() method


        // Thread Concurrency
        // Threads execute side by side utilizing time slicing to rapidly jump back and forth between execution.
        // Simulates a parallel execution on a single CPU core
        // Thread Parallelism
        // Threads execute on their own CPU cores in parallel

        // MultiProcessing: Multiple processors/CPUs executing concurrently. The unit is CPU
        // MultiTasking: Multiple tasks/processes running concurrently on a single CPU.
        // ex: a single person executing multiple tasks (actions)
        // MultiThreading: Multiple parts of the same application running concurrently.
        // ex: multiple people each with their own tasks executing concurrently or in parallel

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are now in runnable thread: " + Thread.currentThread().getName());
                System.out.println("The thread priority is: " + Thread.currentThread().getPriority());
            }
        });

        thread1.setName("Runner");
        thread1.setPriority(1);

        thread1.start();

        Thread thread2 = new Thread(() -> {
            System.out.println("We are now in lambda thread: " + Thread.currentThread().getName());
            System.out.println("The thread priority is: " + Thread.currentThread().getPriority());
        });

        thread2.setName("Maize");

        thread2.start();

        Thread thread3 = new NewThread("blaid");
        thread3.start();
        Thread.sleep(5000);

        thread3.interrupt();
    }

    private static class NewThread extends Thread{

        public NewThread(String name){
            this.setName(name);
        }

        public void run() {
            System.out.println("We are now in class thread: " + Thread.currentThread().getName());
            System.out.println("The thread priority is: " + Thread.currentThread().getPriority());
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("We made it.");
        }
    }
}
