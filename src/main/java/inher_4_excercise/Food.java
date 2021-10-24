package inher_4_excercise;

public abstract class Food implements Disclaimer{

    String name;
    boolean organic;
    double cost;

    public Food(String name, boolean organic, double cost) {
        this.name = name;
        this.organic = organic;
        this.cost = cost;
    }

    public void foodDisclaimer() {
        System.out.println(" This informations is not idependently verified");
    }

    abstract void display();


    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", organic=" + organic +
                ", cost=" + cost +
                '}';
    }
}
