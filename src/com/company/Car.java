package com.company;

public class Car {
    private int id;
    private String numberCars;

    public Car() {
    }

    public Car(int id, String numberCars) {
        this.id = id;
        this.numberCars = numberCars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberCars() {
        return numberCars;
    }

    public void setNumberCars(String numberCars) {
        this.numberCars = numberCars;
    }

    @Override
    public String toString() {
        return "Key -> car:" +
                "\nid: " + id +
                "\nnumberCars: " + numberCars +
                "\n";
    }
}