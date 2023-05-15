package com.iulifinttraining.classesandobjects.autoservicetask;

public class Tool {

    String name;
    boolean needsElectricity;
    boolean hasElevator;
    boolean isUsed;
    long uniqueCode;
    double priceUSD;
    double weightKG;

    public Tool(String name) {
        this.name = name;

        System.out.println("Un obiect de tip Tool a fost creat cu numele: " + this.name);

    }

    public Tool() {
        System.out.println("A fost creat un obiect de tip Tool. La moment nu dispunem de informatii aditionale despre el." +
                " La moment proprietatile lui au urmatoarele valori:\r\nname: " + this.name + "\r\nneedsElectricity: " +
                this.needsElectricity + "\r\nhasElevator: " + this.hasElevator + "\r\nisUsed: " + this.isUsed +
                "\r\nuniqueCode" + this.uniqueCode + "\r\npriceUSD: " + this.priceUSD + "\r\nweightKG: " + this.weightKG);

    }

    public void printInformationTool() {
        System.out.println("=========================================================================================");
        System.out.println("Instrumentului cu numele: " + this.name + " i-au fost initializate toate proprietatile dupa " +
                "cum urmeaza:" + "\r\nneedsElectricity: " +
                this.needsElectricity + "\r\nhasElevator: " + this.hasElevator + "\r\nisUsed: " + this.isUsed +
                "\r\nuniqueCode: " + this.uniqueCode + "\r\npriceUSD: " + this.priceUSD + "\r\nweightKG: " + this.weightKG);
        System.out.println("=========================================================================================");
    }
}
