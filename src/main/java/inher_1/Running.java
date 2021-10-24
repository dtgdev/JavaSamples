package inher_1;

public class Running extends Shoes {
    private double weight;

    public Running(String brand, double size, double weight) {
        super(brand, size);
        this.weight = weight;
    }

    @Override
    public void display(){
        System.out.println(" you have purchased a running shoes");
    }
}
