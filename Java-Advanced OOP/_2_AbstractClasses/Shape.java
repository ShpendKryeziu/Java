package _2_AbstractClasses;

public abstract class Shape {
    private double height;
    private double width;
    public Shape(double height, double width) {
        setHeight(height);
        setWidth(width);
    }
    abstract double calculateArea();
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
}
