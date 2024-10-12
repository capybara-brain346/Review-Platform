package com.restaurant.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class ReviewModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "review_id")
    private int review_id;

    @Column(name = "review")
    private String review;

    @Column(name = "sentiment")
    private String sentiment;

    public ReviewModel(String review, String sentiment) {
        this.review = review;
        this.sentiment = sentiment;
    }

    public String getReview() {
        return this.review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getSentiment() {
        return this.sentiment;
    }

    public void setSentiment() {
        this.sentiment = sentiment;
    }
}
