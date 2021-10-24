package inher_1;

public class Walking extends Shoes {
    private String color;

    public Walking(String brand, double size, String color) {
        super(brand, size);
        this.color = color;
    }

    @Override
    public void display(){
        System.out.println(" you have purchased a walking shoes");
    }
}
