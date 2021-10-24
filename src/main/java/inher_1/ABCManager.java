package inher_1;

public class ABCManager {

    public void display(Costco costco){

    }

    public static void main(String[] args) {
        ABCManager abcManager = new ABCManager();

        Costco a = new Agent();
        Boss boss = new Boss(" Test");
        abcManager.display(a);
        abcManager.display(boss);
    }
}
