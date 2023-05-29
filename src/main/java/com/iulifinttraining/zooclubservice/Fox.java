package com.iulifinttraining.zooclubservice;

public class Fox extends Animal {

    public Fox(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("Fox " + this.getName() + " is eating chicken");
    }

    @Override
    public void makeSound() {
        System.out.println("Fox " + this.getName() + " says: pffff shhhhh");
    }
}
