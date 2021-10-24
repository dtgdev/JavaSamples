package inher_3;

public class Rectangle implements Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public <string> Rectangle(double width) {
        this.width = width;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2* width * 2 * length;
    }

    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return " width : "+ width+"  length : "+length;
    }
}
