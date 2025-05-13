package org.example.characters;

public abstract class Person {
    protected String name;
    protected String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public abstract void printInfo();
}
