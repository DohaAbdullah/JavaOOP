package com.exampleConstructure;

public class Product {
    private String name;

    private String description;
    private float price;

    private int quantity;

    private float discount;

    private String color;

    public Product(String name, String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;

    }

    public Product(Product product) {
        this.name = product.name;
        this.description = product.description;
        this.price = product.price;
        this.discount = product.discount;
    }

    public Product(String name, String description, float price, int quantity, float discount, String color) {
        this(name, description, price, quantity, discount);
        this.color = color;
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;

    }

    public Product() {
        this.name = "no name";
        this.description = "no description";
        this.quantity = 0;
        this.price = 0.0f;
        this.discount = 0.0f;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    int getQuantity() {
        return quantity;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    float getDiscount() {
        return discount;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", color='" + color + '\'' +
                '}';
    }
}


