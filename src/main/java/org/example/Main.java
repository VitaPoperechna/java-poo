package org.example;
import org.example.characters.Character;
import org.example.characters.Home;

public class Main {
    public static void main(String[] args) {
        Character romeo = new Character("Romeo", "main", "man", true);
        Character juliet = new Character("Juliet", "main", "woman", true);

        romeo.printInfo();
        juliet.cry();
        juliet.die();
        Home montague = new Home("Montague");
        Home capulets = new Home("Capulets");

        System.out.println(romeo.getName() + " of " + montague);
        System.out.println(juliet.getName() + " of " + capulets);

    }
}