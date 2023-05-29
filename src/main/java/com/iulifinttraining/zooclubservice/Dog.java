package com.iulifinttraining.zooclubservice;

public class Dog extends Animal {

    public Dog(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("Dog " + this.getName() + " is eating meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + this.getName() + " says: woof woof ham ham");
    }
}
