package com.iulifinttraining.accessmodifiers;

import com.iulifinttraining.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        // First object created with 1 parameter Constructor
        Person iulianFintina = new Person(12001526556555L);
        iulianFintina.readingBook = "Java Fundamentals";
        iulianFintina.name = "Fintina";
        iulianFintina.surname = "Iulian";
        iulianFintina.setAge(24);
        System.out.println(iulianFintina);
        Person.printInfo();

        // Second object created with multiple parameters Constructor
        Person andreiBuzu = new Person("Buzu", "Andrei", "ISTQB", 1235681456523L, 25, "Masculin", "Chisinau", false, 180.0,
                "blue", 75.0, "Master", "Moldovean", false, "andrei@gmail.com", "373682565");
        System.out.println(andreiBuzu);
        Person.printInfo();

        Person mihaiEminescu = new Person(66606666556555L);
        mihaiEminescu.readingBook = "Amintiri din Copilarie";
        mihaiEminescu.name = "Eminescu";
        mihaiEminescu.surname = "Mihai";
        mihaiEminescu.setAge(100);
        System.out.println(mihaiEminescu);
        Person.printInfo();

        Person ionCreanga = new Person("Creanga", "Ion", "Econometrie", 18952225226523L, 115, "Masculin", "Horodiste", true, 180.0,
                "green", 75.0, "Master", "Moldovean", true, "ion@gmail.com", "37369899887");
        System.out.println(ionCreanga);
        Person.printInfo();
    }
}
