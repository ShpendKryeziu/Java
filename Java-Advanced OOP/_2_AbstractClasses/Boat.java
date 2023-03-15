package _2_AbstractClasses;

public class Boat implements Movable{
    @Override
    public void moveForward() {
        System.out.println("Don't topple!");
    }

    @Override
    public void moveBackward() {
        System.out.println("You can't do that, turn around...");
    }
}
