package com.iulifinttraining.accessmodifiers.synchronizednonaccessmodifier;

public class SynchronizedJavaDemonstration {

    public static void main(String[] args) {
        final Table table = new Table();
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1 is running");
            table.printEverything(5);
            System.out.println("Thread1 finished");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread2 is running");
            table.printEverything(10);
            System.out.println("Thread2 is finished");
        });
        Thread3 thread3 = new Thread3(table);
        Thread4 thread4 = new Thread4(table);
        // Next I have started all threads, but as well I have added join() methods in order to wait for a thread to finish
        // its work and after that start another one. If join () method will be removed, then threads might be executed asynchronously
        // but, it will be no more that just one thread at a time to use the printEverything method from Table class.
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        thread4.start();
        try {
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
