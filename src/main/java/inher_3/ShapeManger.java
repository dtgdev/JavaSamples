package inher_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ShapeManger {

    ArrayList<String> names = new ArrayList();
    List<String> lastNames = new Vector();

   public double findArea(Shape shape){
       return shape.area();
   }

   //create a display method that has parameter of Draw to display the content defined in the display method

    public void display(Shape shape){
       shape.display();
    }

    public void perimeter(Shape shape){
        System.out.println("perimeter : "+shape.perimeter());
    }


    public void collectInfo(){
       names.add("David");
       names.add("Tom");
    }

    public static void main(String[] args) {

       ShapeManger shapeManger = new ShapeManger();

//        Rectangle rectangle = new Rectangle(23,18);
//        Circle circle = new Circle(18.6);


        Shape rectangle = new Rectangle(23,18); // A001
        double area = shapeManger.findArea(rectangle);
        System.out.println("area of rec : "+ area);

        shapeManger.display(rectangle);
        shapeManger.perimeter(rectangle);


        Shape circle = new Circle(18.6);
        area = shapeManger.findArea(circle);
        System.out.println("area of cir : "+ area);
        shapeManger.display(circle);
        shapeManger.perimeter(circle);



//
//        List<String> stringList = new ArrayList();


    }
}
