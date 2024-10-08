package animals;

import java.util.Random;

public class Cat extends FarmAnimal  {




    public Cat(String firstName, int firstAge, double firstWeight) {
        super(firstName, firstAge,firstWeight);
    }

    //The Cat has 3 randomized reaction possibilities when it´s asked to play.
    public String play(){
        Random random = new Random();
        int p = random.nextInt(1,3);

        if (this.getHungry() == true) {
            return "Your cat is hungry, it needs food to be able to play again :(";
        }

        if (p == 2) {
            return "The cat is angry and doesn´t want to play.";
        }
        else {
            setHungry(true);
            return "The cat is happy to play and wants pets.";
        }
    }

    @Override
    public String makeSound(){
        return "Miaaaaauuuuuuu!";
    }




}
