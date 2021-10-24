package domain;

public class Address extends GlobalAddress {
    private int id;
    private String street;

    public Address(int id, String street,String intAdd) {
        super(intAdd);
    }

    public Address(int id, String street){
        this.id =  id;
        this.street=  street;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
