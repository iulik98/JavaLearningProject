package com.iulifinttraining.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {

        Animal dogRex = new Dog("Rex");
        System.out.println("Numele obiectului dogRex este: " + dogRex.getName());
        dogRex.eat();
        dogRex.makeSound();

        Animal catSam = new Cat("Sam");
        System.out.println("Numele obiectului catSam este: " + catSam.getName());
        catSam.eat();
        catSam.makeSound();

        Animal foxVulpe = new Fox("Vulpea");
        System.out.println("Numele obiectului foxVulpe este: " + foxVulpe.getName());
        foxVulpe.eat();
        foxVulpe.makeSound();

        dogRex.setName("Bobby");
        System.out.println("Numele actualizat al obiectului dogRex este: " + dogRex.getName());

    }
}
