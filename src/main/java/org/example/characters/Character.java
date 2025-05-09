package org.example.characters;

public class Character extends Person {
    private String role;
    private Home house;
    private boolean isAlive;

    public Character(String name, String role, String gender, Home house, boolean isAlive) {
        super(name, gender);
        this.role = role;
        this.house = house;
        this.isAlive = isAlive;
    }

    @Override
    public void printInfo() {

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Home getHouse() {
        return house;
    }

    public void setHouse(Home house) {
        this.house = house;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
