package datastracture;

public class Student {
    Long id;
    String name;
    String address;
    double gpa;

    public Student(Long id, String name, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean equals(Student obj) {
        return (this.address.equals(obj.address));
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }

//    @Override
//    public int compareTo(Student student) {
//
////        return  this.getId().compareTo( student.getId() );
//        return  student.getId().compareTo( this.getId() );
//       // return  student.getCountryName().compareTo(this.getCountryName()  );
//    }
}
