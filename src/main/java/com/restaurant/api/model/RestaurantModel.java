package com.restaurant.api.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "restaurants")
public class RestaurantModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "restaurant_id")
    private Integer id;
    private String name;
    private String location;

    @OneToMany(targetEntity = ReviewModel.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurant_reviews", referencedColumnName = "restaurant_id")
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
