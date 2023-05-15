package com.iulifinttraining.accessmodifiers.peopleevidence;

public class Person {

    // This property is private class variable, which means it will be accessible only within Person class;
    private static int totalNumberOfTotalPersonObjects;

    // The final keyword is non access modifier which means that this property can not be changed during the execution;
    private final long CNP;
    public String name;
    public String surname;
    public String readingBook;

    //Protected means that it can be accessed only in classes for the peopleevidence package and subclasses;
    protected String phone;
    String gender;
    String residence;
    boolean isRetired;
    double height;
    String eyeColor;
    double weight;
    String education;
    String nationality;
    boolean isMarried;
    String emailAddress;

    // This is private instance variable. It is instance because it describes the objects. Private means that it will be accessible only within Person class.
    private int age;


    // The following is a constructor with 1 parameter: CNP. As well, it increases the totalNumberOfTotalPersonObjects by 1.
    public Person(long CNP) {
        this.CNP = CNP;
        totalNumberOfTotalPersonObjects++;
    }

    // The following is a constructor which initializes all the object properties. As well, it increases the totalNumberOfTotalPersonObjects by 1.
    public Person(String name, String surname, String readingBook, long CNP, int age, String gender, String residence,
                  boolean isRetired, double height, String eyeColor, double weight, String education, String nationality,
                  boolean isMarried, String emailAddress, String phone) {
        this.name = name;
        this.surname = surname;
        this.readingBook = readingBook;
        this.CNP = CNP;
        this.age = age;
        this.gender = gender;
        this.residence = residence;
        this.isRetired = isRetired;
        this.height = height;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.education = education;
        this.nationality = nationality;
        this.isMarried = isMarried;
        this.emailAddress = emailAddress;
        this.phone = phone;

        totalNumberOfTotalPersonObjects++;
    }

    //This is setter method for private variable age.
    public void setAge(int age) {
        if (age > 0) {
            if (age < 128) {
                this.age = age;
            } else {
                System.out.println("Age is exceeded; Will not be set");
            }
        } else {
            System.out.println("Age is < 0; Will not be set");
        }
    }

    //This is getter method for private variable CNP;
    public long getCNP() {
        return CNP;
    }

    //This is getter method for private variable age;
    public int getAge() {
        return age;
    }
    // Overriding the toString method in order to print all the object properties.
    @Override
    public String toString() {
        return "Person{" +
                "CNP=" + CNP +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", readingBook='" + readingBook + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", residence='" + residence + '\'' +
                ", isRetired=" + isRetired +
                ", height=" + height +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                ", education='" + education + '\'' +
                ", nationality='" + nationality + '\'' +
                ", isMarried='" + isMarried + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", age=" + age +
                '}';
    }
    // Method for printing totalNumberOfTotalPersonObjects.
    public static void printInfo(){
        System.out.println("Numarul total de persoane adaugate este: " + totalNumberOfTotalPersonObjects);
    }
}
