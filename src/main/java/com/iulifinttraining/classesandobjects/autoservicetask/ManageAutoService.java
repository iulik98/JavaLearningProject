package com.iulifinttraining.classesandobjects.autoservicetask;

public class ManageAutoService {

    public static void main(String[] args) {

        Tool computer = new Tool();
        computer.name = "Toshiba";
        computer.weightKG = 1.10;
        computer.uniqueCode = 1235465;
        computer.priceUSD = 1000.00;
        computer.isUsed = false;
        computer.needsElectricity = true;
        computer.hasElevator = false;
        computer.printInformationTool();

        Tool elevator = new Tool("elevator");
        elevator.weightKG = 2000.00;
        elevator.uniqueCode = 1235466;
        elevator.priceUSD = 15000.00;
        elevator.isUsed = true;
        elevator.needsElectricity = true;
        elevator.hasElevator = true;
        elevator.printInformationTool();

        Car toyotaAuris = new Car("UFF 001");
        toyotaAuris.make = "Toyota";
        toyotaAuris.model = "Auris";
        toyotaAuris.productionYear = 2013;
        toyotaAuris.fuelType = "Diesel";
        toyotaAuris.gearType = "Manual";
        toyotaAuris.vinCode = "AVSTDGA1358ASFAE8";
        toyotaAuris.carPriceUSD = 8000.00;
        toyotaAuris.km = 206000;
        toyotaAuris.printInformationCar();

        Car volkswagenPolo = new Car("Volkswagen","Polo",2001,"Diesel");
        volkswagenPolo.licensePlate = "SG AO 914";
        volkswagenPolo.gearType = "Manual";
        volkswagenPolo.vinCode = "AVSTDGA164853FAE8";
        volkswagenPolo.carPriceUSD = 2000.00;
        volkswagenPolo.km = 300000;
        volkswagenPolo.printInformationCar();

        Garage garageFirst = new Garage("GarajulMeu","Florilor 4/2",true,7,"7/A","24/7");

        Worker ionWorker = new Worker();
        ionWorker.name = "Ion Ion";
        ionWorker.sexType = "Masculin";
        ionWorker.age = 18;
        ionWorker.isExperienced = false;
        ionWorker.heightCM = 175.5;
        ionWorker.weightKG = 70.3;
        ionWorker.specialisation = "Electronic Diagnostics";

        System.out.println("A fost inregistrat un obiect de tip Worker cu urmatoarele proprietati:\r\nname: " + ionWorker.name
         + "\r\nsexType: " + ionWorker.sexType + "\r\nage: " + ionWorker.age + "\r\nisExperienced: " + ionWorker.isExperienced
        + "\r\nheightCM: " + ionWorker.heightCM + "\r\nweightKG: " + ionWorker.weightKG + "\r\nspecialisation: " + ionWorker.specialisation);

    }
}
