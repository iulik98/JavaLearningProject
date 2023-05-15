package com.iulifinttraining.accessmodifiers.synchronizednonaccessmodifier;

public class Thread3 extends Thread{
    Table t;
    public Thread3(Table t){
        this.t = t;
    }
    public void run() {
        System.out.println("Thread3 is running");
        t.printEverything(5);
        System.out.println("Thread3 is finished");
    }
}
