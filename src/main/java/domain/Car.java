package domain;

import java.util.List;

public class Car extends Vehicle {
    String model;
    List<Parts> parts;

    public Car(String model, List<Parts> parts, String brand) {
        this.model = model;
        this.parts = parts;
        this.brand = brand;
    }
}
