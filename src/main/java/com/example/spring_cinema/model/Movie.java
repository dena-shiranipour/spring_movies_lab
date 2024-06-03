package com.example.spring_cinema.model;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //primary key serial
    // properties
    @Column(name = "id")
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "rating")
    private int rating;
    @Column(name= "duration")
    private int duration;


    //contructors, //json in postman should look like this
    public Movie(String title, int rating){
        this.title = title;
        this.rating = rating;
        this.duration= duration;
    }

    public Movie() {
    }

    //getter and setter
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
