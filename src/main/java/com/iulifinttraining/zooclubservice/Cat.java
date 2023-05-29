package com.iulifinttraining.zooclubservice;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + this.getName() + " is eating mice");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + this.getName() + " says: miau miau");
    }
}
