package inher_2;

public abstract class Manufacturer extends Shoes {

    public Manufacturer(String brand, double size) {
        super(brand, size);
    }

    public Manufacturer(String brand, double size, String material) {
        super(brand, size, material);
    }

    public abstract void countryPolicy();


}
