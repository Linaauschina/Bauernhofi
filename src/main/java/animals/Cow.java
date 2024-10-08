package animals;

import java.util.Random;

public class Cow extends FarmAnimal {

    public Cow (String firstName, int firstAge, double firstWeight){
        super(firstName, firstAge, firstWeight);
    }


//The cow can give 20-30 litres of milk.
    public String milk(){
        if (this.getHungry() == true) {
            return "The cow needs to eat before it can give milk again.";
        }
        setHungry(true);
        Random random = new Random();
        int milkInLitres = random.nextInt(20,30);
        return "The cow has been milked, in total " + milkInLitres + " litres." ;
    }

    @Override
    public String makeSound(){
        return "Mew..";
    }



}
