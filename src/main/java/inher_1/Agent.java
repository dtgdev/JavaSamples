package inher_1;



public class Agent extends Boss {

    public Agent() {
        super("Tom");
        System.out.println(" I am in A");
    }

    public static void main(String[] args) {
        Agent agent = new Agent();
//        agent.display();
    }
}
