package inher_2;

public abstract class Shoes {
    private String brand;
    private double size;
    private String material;

    public Shoes() {
    }

    public Shoes(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    public Shoes(String brand, double size, String material) {
        this.brand = brand;
        this.size = size;
        this.material = material;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public abstract void describeMaterial();

}
