package ru.putilin.springjdbc.Model;

public class Product {
    private String productName;

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
