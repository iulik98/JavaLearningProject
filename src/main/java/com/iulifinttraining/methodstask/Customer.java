package com.iulifinttraining.methodstask;

public class Customer {

    private String name;
    private int age;
    private String email;

    public Customer(String name, int age, String email) {
        this.name = name;
        this.email = email;
        if (age < 0 || age > 127){
            System.out.println("Varsta este invalida;");
            this.age = 0;
        } else this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge < 0 || newAge>127) {
            System.out.println("Varsta " + newAge + " este invalida");
        } else {this.age = newAge;}
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
