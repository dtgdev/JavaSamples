package Generics;

public class MClass {

    public static void main(String[] args) {
        TestClass<Integer,Double> mClass = new TestClass(20);
        TestClass<Integer,Double> mClass2 = new TestClass(20,23);
        mClass.showType();
    }
}
