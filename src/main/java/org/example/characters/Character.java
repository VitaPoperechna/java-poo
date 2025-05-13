package org.example.characters;

import org.example.interfaces.Actions;

public class Character extends Person implements Actions {
    private String role;
    private boolean isAlive;

    public Character(String name, String role, String gender, boolean isAlive) {
        super(name, gender);
        this.role = role;
        this.isAlive = isAlive;
    }

    @Override
    public void printInfo() {
        System.out.println("I'm a " + super.gender + " my name is " + super.name);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public void cry() {
        System.out.println("I cry non-stop");
    }

    @Override
    public void laugh() {
        System.out.println("I laugh non-stop");
    }

    @Override
    public void die() {
        System.out.println("I am dying");
    }
}
