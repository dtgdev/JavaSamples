package inher_2;


public class Walking extends Manufacturer {
    private String color;

    public Walking(String brand, double size, String color) {
        super(brand, size);
        this.color = color;
    }

    public Walking(String brand, double size, String material, String color) {
        super(brand, size, material);
        this.color = color;
    }

    @Override
    public void describeMaterial() {
        System.out.println(" This shoes is made from silk ");
    }


    @Override
    public void countryPolicy() {
        System.out.println(" No child younger than 16 allowed to work");
    }
}
