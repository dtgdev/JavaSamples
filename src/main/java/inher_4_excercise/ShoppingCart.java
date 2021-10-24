package inher_4_excercise;

public class ShoppingCart {
    double total;

    public void addPrice(Food food){
        total += food.cost;
    }

    public void totalPrice(){
        System.out.println(total);
    }

    public void diplay(Food food){
        food.display();
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Food vegetable = new Vegetable("Bean",true,1.24,false,false,true);
        shoppingCart.addPrice(vegetable);
        shoppingCart.diplay(vegetable);

        Food meat = new Meat("Pork",true,2.56,true);
        shoppingCart.addPrice(meat);
        shoppingCart.diplay(meat);


        shoppingCart.totalPrice();
    }


}
