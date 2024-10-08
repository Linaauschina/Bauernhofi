package org.example;

import animals.*;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    Chicken chicken = new Chicken("Marvin", 3, 15);

    Cat cat = new Cat("Findus", 15, 5.5);

    Pig pig = new Pig("Fridolin", 7, 55.8);

    Cow cow = new Cow("Klaus", 3, 140.6);

    String input = "";





    public void animalInteraction() {
        switch (input) {
            case "milk" -> {
                System.out.println(cow.milk());
            }
            case "gather" -> {
                System.out.println(chicken.gatherEggs());
            }
            case "play" -> {
                System.out.println(cat.play());
            }
            case "check" -> {
                System.out.println(pig.checkIfSleeping());
            }
        }
    }
}