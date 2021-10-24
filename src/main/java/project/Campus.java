package project;

public class Campus extends College {
    String campus_name;
    Address address;

    public Campus(String name, String campus_name, String city, String state) {
        super(name);
        this.campus_name = campus_name;
//        this.address = address;
//        this.city = city;x
    }

    public Campus(String name, String campus_name, Address address) {
        super(name);
        this.campus_name = campus_name;
        this.address = address;
    }

    public String getCampus_name() {
        return campus_name;
    }

    public void setCampus_name(String campus_name) {
        this.campus_name = campus_name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.name.toString() + " " + this.campus_name + " " + this.address;
    }
}
