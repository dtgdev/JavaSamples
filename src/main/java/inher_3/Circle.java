package inher_3;

        import javax.swing.*;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }

    public double getR(){
        return r;
    }

    public void display() {
        System.out.println(toString());
    }

    public void test(){
        System.out.println("test");
    }

    @Override
    public String toString() {
        return " radius : "+ r;
    }
}
