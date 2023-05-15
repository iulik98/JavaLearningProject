package com.iulifinttraining.classesandobjects.autoservicetask;

public class Garage {

    String address;
    String name;
    String numberID;
    boolean hasComputerDiagnostics;
    int carCapacity;
    String scheduler;

    public Garage(String name, String address, boolean hasComputerDiagnostics, int carCapacity, String numberID, String scheduler) {
        this.name = name;
        this.address = address;
        this.hasComputerDiagnostics = hasComputerDiagnostics;
        this.carCapacity = carCapacity;
        this.numberID = numberID;
        this.scheduler = scheduler;

        System.out.println("S-a inregistrat un obiect de tip Garage cu urmatoarele proprietati:\r\nname: " + this.name + "\r\naddress: "
                + this.address + "\r\nhasComputerDiagnostics: " + this.hasComputerDiagnostics + "\r\ncarCapacity: "
                + this.carCapacity + "\r\nnumberID: " + this.numberID + "\r\nscheduler" + this.scheduler);
        System.out.println("=========================================================================================");
    }

}
