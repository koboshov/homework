package com.company;

public class Porsche {
    private int year;
    private int release;
    private String model;
    private int price;
    private String colour;

    public Porsche(int year, int release, String model, int price, String colour) {
        this.year = year;
        this.release = release;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Porsche{" +
                "year=" + year +
                ", release=" + release +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
