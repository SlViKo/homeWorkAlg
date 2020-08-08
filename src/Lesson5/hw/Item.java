package Lesson5.hw;

public class Item {
    private String name;
    private double weight;
    private double price;

    public Item(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " weight: " + weight + " price: " + price;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
