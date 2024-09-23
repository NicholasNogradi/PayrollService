package com.example.Payroll;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Product {
    private @Id @GeneratedValue Long id;
    private String type;
    private String name;
    private String version;
    private double price;

    public Product () {}

    public Product(String type, String name, String version, double price) {
        this.type = type;
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public double getPrice() {
        return this.price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if(!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(type, product.type) && Objects.equals(name, product.name) && Objects.equals(version, product.version) && Double.compare(price, product.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.type, this.name, this.version, this.price);
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + this.id + ", type='" + this.type + '\'' + ", name='" + this.name + '\'' + ", version='" + this.version + '\'' + ", price=" + this.price + '}';
    }

}
