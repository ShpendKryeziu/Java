package _1_Inheritance;

public class Dog extends Animal {
    private String breed;
    public Dog(String breed, double height, double weight) {
        super(height, weight);
        setBreed(breed);
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public double runSpeedMetersPerSecond() { return this.getHeight()*2; }
    @Override
    public String toString() {
        return "Dog: " + breed + '\'';
    }
}
