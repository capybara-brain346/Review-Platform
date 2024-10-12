package com.restaurant.api.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "restaurants")
public class RestaurantModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "restaurant_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "reviews")
    @OneToMany(cascade = CascadeType.ALL)
    private List<ReviewModel> reviews;

    public RestaurantModel(String name, String location) {
        this.name = name;
        this.location = location;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation() {
        this.location = location;
    }
}
