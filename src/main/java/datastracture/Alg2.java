package datastracture;

import java.util.HashMap;
import java.util.Map;

public class Alg2 {


    public static void mapEx() {

        Map<Integer,Student> map = new HashMap<>();

        map.put(11,new Student("David","Houston TX",2.9));
        map.put(23,new Student("Alex","Houston TX",3.9));
        map.put(4321,new Student("Mark","Houston TX",3.3));



        for( int key  : map.keySet()){
            System.out.print(key);
            System.out.println(" "+map.get(key).name);

        }

    }

    public static void main(String[] args) {

        mapEx();
    }

}
