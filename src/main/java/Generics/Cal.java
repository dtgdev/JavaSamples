package Generics;

public class Cal<T extends Number>{


    public int add(T x, T y){
        return x.intValue() + y.intValue();
    }



}
