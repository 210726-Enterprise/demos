package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Driver {

    // Multithreading is great!
    // Concurrency?
    //  We have two functions that we're performing where the cpu is rapidly bouncing back and forth
    // Parallelism
    //  We have two functions that we're performing and each function has their own cpu/resource

    // Thread Lifecycle / State

    // New - this state is when the object is instantiated
    // Runnable - this state occurs when we call thread.start() which gives it visibility to the thread schedule
    // Running - this state occurs when the thread schedule picks up and executes a thread
    // Blocked/Waiting - this state occurs when a thread is waiting on either a resource like a key, or for a set amount of time (sleep)
    // Dead - once the thread finishes execution, it goes into a dead state and can not be resurrected

    public static void main(String[] args) throws ExecutionException, InterruptedException {



        // three ways to create threads and have them execute
        // 1. Implement runnable
        Thread runnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Current thread: " + Thread.currentThread().getName());
            }
        });
        runnableThread.setName("Runnable Thread");
        runnableThread.start();
        // 2. Extend the Thread class and override the run() method
        MyThread myThread = new MyThread("My Thread");
        myThread.start();
        // 3. Executor Service
        ExecutorService executor = Executors.newFixedThreadPool(10);


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Current runnable thread: " + Thread.currentThread().getName());
            }
        };

        List<Callable<String>> callableTasks = new ArrayList<>();



        Callable<String> callable = () -> "Current callable thread: " + Thread.currentThread().getName();

        for(int i = 0; i < 20; i++){
            callableTasks.add(callable);
        }

        Future<?> runnableResult = executor.submit(runnable);

        List<Future<String>> results = executor.invokeAll(callableTasks);

        System.out.println("Callable Results:");
        results.forEach(result -> {
            try {
                System.out.println(result.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        System.out.println("Runnable Results:");
        System.out.println(runnableResult.get());
        //Future<String> result =  executor.submit(callable);

        //System.out.println(result.get());


        executor.shutdown();
    }
}

class MyThread extends Thread{

    public MyThread(String name){
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println("Current thread: " + Thread.currentThread().getName());
    }
}

