package inher_4_excercise;

public class Meat extends Food {
    boolean isGrassFed;

    public Meat(String name, boolean organic, double cost) {
        super(name, organic, cost);
    }

    void display() {
        System.out.println(toString());
    }

    double protein() {
        return 2.4;
    }

    public Meat(String name, boolean organic, double cost, boolean isGrassFed) {
        super(name, organic, cost);
        this.isGrassFed = isGrassFed;
    }

    public boolean isGrassFed() {
        return isGrassFed;
    }

    public void setGrassFed(boolean grassFed) {
        isGrassFed = grassFed;
    }


    @Override
    public String toString() {
        return "Meat{" +
                "isGrassFed=" + isGrassFed +
                '}';
    }
}
