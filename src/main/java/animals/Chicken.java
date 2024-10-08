package animals;

import java.util.Random;

public class Chicken extends FarmAnimal  {


    public Chicken(String firstName, int firstAge, double firstWeight){
       super(firstName, firstAge,firstWeight);
    }

// The chicken can lay up to 2 eggs, and it is possible that it laid no eggs.
    public String gatherEggs(){
        Random random = new Random();
        int eggs = random.nextInt(0,2);
        if (this.getHungry() == true) {
            return "The chicken needs food to lay new eggs!";
        }
        if (eggs == 0 ) {
            return "The chicken didn´t lay eggs. :(";
        }
        else if (eggs == 1) {
            setHungry(true);
            return "The chicken laid an egg! ";
        }
        else {
            setHungry(true);
            return "The chicken laid 2 eggs!";
        }


    }
    public String makeSound(){
        return "Gak gok guk!";
    }





}
