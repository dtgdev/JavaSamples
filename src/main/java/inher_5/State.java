package inher_5;

public class State extends Country {

    boolean stateTax;
    String StateName;

    public State(String name, String continent, boolean stateTax) {
        super(name, continent);
        this.stateTax = stateTax;
    }

    public boolean isStateTax() {
        return stateTax;
    }

    public void setStateTax(boolean stateTax) {
        this.stateTax = stateTax;
    }
}
