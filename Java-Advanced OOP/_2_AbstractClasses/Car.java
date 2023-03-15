package _2_AbstractClasses;

public class Car implements Movable{
    @Override
    public void moveForward() {
        System.out.println("Watch the road and speed limit!");
    }

    @Override
    public void moveBackward() {
        System.out.println("Watch the mirrors!");
    }
}
