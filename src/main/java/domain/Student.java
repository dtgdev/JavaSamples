package domain;

public class Student {

    private int id;
    private String name;
    private float gpa;
    private Address address;

    //Constructor - default
    public Student(){

    }

    //Constructor -
    public Student(int id, String name, float gpa,Address address){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id+" - "+name+" - "+gpa+" - "+address.getStreet();
    }

    @Override
    public boolean equals(Object obj) {
        return ((Student)obj).getName().equalsIgnoreCase(this.name);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    //    create an equals method - override

}
