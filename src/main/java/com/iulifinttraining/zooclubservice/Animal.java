package com.iulifinttraining.zooclubservice;

// Clasa Animal este destinata procesului de mostenire, construcotrul Animal nu trebuie folosit pentru initializarea obiectelor.
public abstract class Animal implements AnimalInterface {

    //Variabila de instanta name este accesibila doar in cadrul clasei Animal
    private String name;

    //Constructorul cu un parametru va permite setarea numelui pentru toate animalele create in cadrul programului.
    protected Animal(String name) {
        this.name = name;
    }

    //Metoda getName() este de tip public si returneaza numele pe care il poseda animalul.
    public String getName() {
        return name;
    }

    // Methoda eat() este de tip abstract, ceea ce semnifica ca ea va trebui implementata in clasele copil.
    public abstract void eat();


    // setName method will be used for setting the name for Animal
    public void setName(String name){
        this.name = name;
    }
}
