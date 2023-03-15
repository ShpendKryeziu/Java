package _1_Inheritance;

public class Bird extends Animal {
    private double wingspan;
    public Bird(double wingspan, double height, double weight) {
        super(height, weight);
        setWingspan(wingspan);
    }
    public double getWingspan() { return wingspan; }
    public void setWingspan(double wingspan) { this.wingspan = wingspan; }
    public double flySpeedMetersPerSecond() { return this.getWingspan()*4; }

    @Override
    public String toString() {
        return "Bird: " + wingspan + '\'';
    }
}
