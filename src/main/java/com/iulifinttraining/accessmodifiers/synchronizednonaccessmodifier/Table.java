package com.iulifinttraining.accessmodifiers.synchronizednonaccessmodifier;

public class Table {

    public synchronized void printEverything(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(i*n);
            try {
                Thread.sleep(400L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
