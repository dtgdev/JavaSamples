package Generics;

public class TestClass<T,S> {
    T obj;
    S obj2;

    public TestClass() {
    }

    public TestClass(T obj) {
        this.obj = obj;
    }

    public TestClass(T obj, S obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    public void showType(){
        System.out.println(obj.getClass().getName());
    }

    public T add(T t, S s){
        return t;

    }

}
