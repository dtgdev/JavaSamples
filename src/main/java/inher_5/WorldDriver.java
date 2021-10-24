package inher_5;

public class WorldDriver {
    public WorldDriver() {
    }

    public static void main(String[] args) {
        State state = new State("US","N. America", false);
        System.out.println(state.getCountryName());
    }
}
