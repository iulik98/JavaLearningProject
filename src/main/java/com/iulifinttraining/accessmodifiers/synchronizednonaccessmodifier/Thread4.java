package com.iulifinttraining.accessmodifiers.synchronizednonaccessmodifier;

public class Thread4 extends Thread{
    Table t;
    public Thread4(Table t){
        this.t = t;
    }
    public void run() {
        System.out.println("Thread4 is running");
        t.printEverything(10);
        System.out.println("Thread4 is finished");
    }
}
