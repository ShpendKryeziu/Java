package _1_Inheritance;

public class Fish extends Animal {
    private String species;
    public Fish(String species, double height, double weight) {
        super(height, weight);
        setSpecies(species);
    }
    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }
    public double swimSpeedMetersPerSecond() { return this.getWeight()*2; }

    @Override
    public String toString() {
        return "Fish: " + species + '\'';
    }
}
