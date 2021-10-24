package inher_2;


public class Running extends Shoes {
    private double weight;

    public Running(String brand, double size, double weight) {
        super(brand, size);
        this.weight = weight;
    }

    @Override
    public void describeMaterial() {
        System.out.println(" It is made from glass");
    }
}
