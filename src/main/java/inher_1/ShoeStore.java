package inher_1;

public class ShoeStore {

    public static void main(String[] args) {
        Shoes shoes = new Shoes("Nike", 10);
        shoes.display();

        Walking walking = new Walking("Nike", 10,"white");
        walking.display();

        Running running = new Running("Nike", 10,146);
        running.display();
    }
}
