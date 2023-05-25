package com.iulifinttraining.methodstask;

import javax.xml.crypto.Data;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.generateRandomInt(10, 15);
        System.out.println("Variabila randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.generateRandomInt(150);
        System.out.println("Variabila randomInt: " + randomInt1);
        System.out.println();
        double randomDouble = DataGeneratorUtil.generateRandomDouble(1000.00);
        System.out.println("Variabila randomDouble: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.generateRandomDouble(-1000.00);
        System.out.println("Variabila randomDouble1: " + randomDouble1);
        System.out.println();
        boolean randomBoolean = DataGeneratorUtil.getRandomBoolean();
        System.out.println("Variabila randomBoolean: " + randomBoolean);
        System.out.println();
        String domain = "@gmail.com";
        System.out.println("Random Email 1: " + DataGeneratorUtil.generateRandomEmail(domain));
        System.out.println("Random Email 2: " + DataGeneratorUtil.generateRandomEmail(domain));
        System.out.println();
        String randomValidString = DataGeneratorUtil.generateValidRandomString(45);
        System.out.println("Random Valid String is " + randomValidString);

        String randomInValidString = DataGeneratorUtil.generateInvalidRandomString(7);
        System.out.println("Random InValid String is " + randomInValidString);
        System.out.println();

        Customer ionCustomer = new Customer("Rusu", 36, "ion.rusu@gmail.com");
        System.out.println("Numele obiectului ionCustomer pana la casatorie este " + ionCustomer.getName());
        System.out.println("Varsta obiectului ionCustomer este " + ionCustomer.getAge());
        System.out.println("Emailul obiectului ionCustomer este " + ionCustomer.getEmail());
        System.out.println("===============================Casatoria lui ionCustomer==================");
        ionCustomer.setName("Moldovanu");
        ionCustomer.setAge(128);
        ionCustomer.setAge(-17);
        ionCustomer.setEmail("ion.moldovanu@gmail.com");
        ionCustomer.setAge(37);
        System.out.println("Numele obiectului ionCustomer dupa casatorie este " + ionCustomer.getName());
        System.out.println("Varsta obiectului ionCustomer este " + ionCustomer.getAge());
        System.out.println("Emailul obiectului ionCustomer este " + ionCustomer.getEmail());
        System.out.println("======================================================================");
        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12),DataGeneratorUtil.generateRandomInt(127),
                DataGeneratorUtil.generateRandomEmail("@data.com"));
        System.out.println(randomDataCustomer.toString());
        System.out.println();
        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(6));
        randomDataCustomer.setAge(DataGeneratorUtil.generateRandomInt(18,64));
        randomDataCustomer.setEmail(DataGeneratorUtil.generateRandomEmail("@mail.com"));
        System.out.println(randomDataCustomer.toString());


    }

}
