package Generics;

public class Student<T> {
    String name;
    int age;
    T courses;

    public Student(String name, int age, T courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }
}
