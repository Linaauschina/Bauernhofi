package org.example;

import animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Chicken chicken = new Chicken("Marvin", 3, 15);

        Cat cat = new Cat("Findus", 15, 5.5);

        Pig pig = new Pig("Fridolin", 7, 55.8);

        Cow cow = new Cow("Klaus", 3, 140.6);

        Farm interactions = new Farm();

        

        List<String> animalsNameList = new ArrayList<>();
        animalsNameList.add(cow.getName());
        animalsNameList.add(cat.getName());
        animalsNameList.add(chicken.getName());
        animalsNameList.add(pig.getName());

        List<FarmAnimal> animalsList = new ArrayList<>();
        animalsList.add(cow);
        animalsList.add(cat);
        animalsList.add(chicken);
        animalsList.add(pig);

        List<FarmAnimal> hungryAnimals = new ArrayList<>();

//        System.out.println(cow.milk());
//
//        System.out.println(cow.getName());
        Scanner scanner = new Scanner(System.in);
        String input = "";


//A Menu loop starts giving you options to type in to get different responses
        do {
            System.out.println("Type 1 to show a list of your farm animals. \nType 2 to interact with them! \n" +
                    "Type 3 to feed your animals.");
            input = scanner.next();

            // the first menu option is a name list of all farmanimals
            if (input.equals("1")) {
                System.out.println(animalsNameList);
            }

//second option is to interact with the farmanimals

            if (input.equals("2")) {
                do{
//another loop to be able to return to your animals after interacting.

                System.out.println("Your animals are waiting for you..! \n Type milk to milk " +
                        "your cow. \n Type gather to gather your chickens eggs. \n Type play to play " +
                        "with your cat. \n Type check to look after your pig.");

                input = scanner.next();

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
                System.out.println("If you want to to stay with your animals type ''stay'' or type ''l'' to leave.");
                    input = scanner.next();
                }while (input.equals("stay"));
            }
//third option to check if the animals are hungry and to feed the animals.

            if (input.equals("3")) {

                for (FarmAnimal farmAnimal : animalsList) {
                    if (farmAnimal.getHungry() == true) {
                        hungryAnimals.add(farmAnimal);
                    }
                }


                if (hungryAnimals.size() == 0) {
                    System.out.println("All of your animals are happy and full, no need to feed.");

                } else {
                    System.out.println("Some of your animals are hungry.. press 1 to feed them.");
                    input = scanner.next();
                    if (input.equals("1")) {
                        for (FarmAnimal hungryAnimal : hungryAnimals) {
                            hungryAnimal.setHungry(false);
                        }
                        System.out.println("Good job, they have been fed!");
                    } else {
                        System.out.println("Please only type the given responses.");
                    }

                }
            }





            System.out.println("Type quit to exit or menu to return to the menu.");
            input = scanner.next();

            }while (input.equals("menu"));



}  }