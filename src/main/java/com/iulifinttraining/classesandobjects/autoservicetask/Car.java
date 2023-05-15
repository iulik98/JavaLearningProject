package com.iulifinttraining.classesandobjects.autoservicetask;

public class Car {
    String vinCode;
    String make;
    String model;
    String fuelType;
    int productionYear;
    String gearType;
    int km;
    double carPriceUSD;
    String licensePlate;


    // Constructorul de mai jos primeste 4 parametri de intrare, respectiv va crea obiecte despre care se va cunoaste Marca,
// Modelul, anul producerii si FuelType.
    public Car(String makeParametruDeIntrare, String model, int productionYear, String fuelType) {
        make = makeParametruDeIntrare;
        this.model = model;
        this.productionYear = productionYear;
        this.fuelType = fuelType;

        System.out.println("A fost creat un obiect de tip Car despre care cunoastem doar Marca, Modelul, anul producerii si FuelType");
    }

    //  Constructorul de mai jost primeste doar un parametru de intrare, respectiv odata utilizat, va crea obiecte despre
//  care se va cunoaste doar Codul VIN.
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;

        System.out.println("A fost creat un obiect de tip Car despre care cunoastem doar licensePlate: " + this.licensePlate);
    }

    public void printInformationCar() {
        System.out.println("=========================================================================================");
        System.out.println("Obiectul de tip Car cu licensePlate : " + this.licensePlate + " i-au fost initializate toate " +
                "proprietatile dupa cum urmeaza:" + "\r\nmake: " +
                this.make + "\r\nmodel: " + this.model + "\r\nfuelType: " + this.fuelType +
                "\r\nproductionYear: " + this.productionYear + "\r\ngearType: " + this.gearType + "\r\nKM: " + this.km +
                "\r\ncarPrice: " + this.carPriceUSD);
        System.out.println("=========================================================================================");
    }
}
