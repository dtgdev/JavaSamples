package Generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {

    public void getNames(){
        List<Integer> names =  new ArrayList();
        names.add(33);
        names.add(23);
        display(names);

    }

    public void add(List names){
        Integer total = 0;
        for (Object name : names  ){
           total += (Integer) name;
        }
    }

    public void display(List names){
        for (Object name : names  ){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        TestGenerics testGenerics = new TestGenerics();
        testGenerics.getNames();
        TestClass<String,String> testClass = new TestClass();
    }

}
