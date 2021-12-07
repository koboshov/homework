package com.company;

public class Car {
    private int id;
    private int nomerAvto;

    public Car(int id, int nomerAvto) {
        this.id = id;
        this.nomerAvto = nomerAvto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nomerAvto=" + nomerAvto +
                '}';
    }
}
