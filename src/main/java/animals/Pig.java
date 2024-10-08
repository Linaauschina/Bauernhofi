package animals;

import java.util.Random;

public class Pig extends FarmAnimal {

    public Pig (String firstName, int firstAge, double firstWeight){
        super(firstName, firstAge, firstWeight);
    }

//The pig can either sleep or eat when you check on it.
    public String checkIfSleeping(){
        Random random = new Random();
        int p = random.nextInt(1, 2);
        if (this.getHungry() == true) {
            return "The pig needs food!";
        }
        if (p == 1) {
            setHungry(true);
        return "The Pig is sleeping.";
        }
        else {
            setHungry(false);
            return "The Pig is eating.";
        }
    }

    @Override
    public String makeSound(){
        return "Arrrrrgh :( ";
    }



    }


