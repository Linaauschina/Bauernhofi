package animals;

public abstract class FarmAnimal implements Animal {
    private String name;
    private int age;
    private double weight;
    private boolean hungry = false;

    public FarmAnimal (String firstName, int firstAge, double firstWeight) {
        name = firstName;
        age = firstAge;
        weight = firstWeight;

    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHungry(boolean newHungry) {
        hungry = newHungry;
    }

    public boolean getHungry() {
        return hungry;
    }
}
