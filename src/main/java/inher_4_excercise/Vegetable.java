package inher_4_excercise;

public class Vegetable extends Food {

    boolean isFruit;
    boolean isLeaves;
    boolean isLegumes;

    public Vegetable(String name, boolean organic, double cost) {
        super(name, organic, cost);
    }

    void display() {
        System.out.println(toString());
    }


    public Vegetable(String name, boolean organic, double cost, boolean isFruit, boolean isLeaves) {
        super(name, organic, cost);
        this.isFruit = isFruit;
        this.isLeaves = isLeaves;
    }

    public Vegetable(String name, boolean organic, double cost, boolean isFruit, boolean isLeaves, boolean isLegumes) {
        super(name, organic, cost);
        this.isFruit = isFruit;
        this.isLeaves = isLeaves;
        this.isLegumes = isLegumes;
    }

    public boolean isFruit() {
        return isFruit;
    }

    public void setFruit(boolean fruit) {
        isFruit = fruit;
    }

    public boolean isLeaves() {
        return isLeaves;
    }

    public void setLeaves(boolean leaves) {
        isLeaves = leaves;
    }

    public double totalCost() {
        return 0;
    }
}
