package com.groupassignment.shoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sneaker {

    private String brand;
    private String size;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Sneaker(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    public Sneaker() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
