package _2_AbstractClasses;

public class Rectangle extends Shape {
    public Rectangle (double height, double width) {
        this.height = height; this.width = width;
    }
    @Override
    double calculateArea() {
        return (height*width);
    }
}
