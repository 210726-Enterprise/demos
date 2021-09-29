package com.revature;

import java.util.concurrent.Semaphore;

public class Semaphores {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);


        System.out.println(sem.availablePermits()); // 1
        sem.release();
        System.out.println(sem.availablePermits()); // 2
    }
}
