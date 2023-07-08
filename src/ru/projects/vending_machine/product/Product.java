package ru.projects.vending_machine.product;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {return name;}

    public void setId(int id) {this.id = id;}

    public int getId() { return id;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString() {return "id " + id + ", name " + name + ", price " + price + "р.";}
}
