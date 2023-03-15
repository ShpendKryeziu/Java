package _2_AbstractClasses;

public class Circle extends Shape{
    public Circle (double height, double width) {
        if (height == width) {
            this.height = height;
            this.width = width;
        } else {
            System.out.println("Invalid data, that is not a circle!");
        }
    }

    @Override
    double calculateArea() {
        return (Math.PI * Math.pow((height / 2), 2));
    }
}
