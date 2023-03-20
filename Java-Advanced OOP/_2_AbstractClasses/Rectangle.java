package _2_AbstractClasses;

public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }
    @Override
    double calculateArea() {
        return (getHeight() * getWidth());
    }
}
