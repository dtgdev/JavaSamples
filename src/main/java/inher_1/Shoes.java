package inher_1;

public class Shoes {
    private String brand;
    private double size;

    public Shoes() {
    }

    public Shoes(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public  void display(){
        System.out.println(" you have purchased a shoes");
    }
}
