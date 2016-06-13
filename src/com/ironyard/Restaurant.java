package com.ironyard;

/**
 * Created by illladell on 6/7/16.
 */
public class Restaurant {
    int id;
    String name;
    String location;
    int rating;
    String comment;

    public Restaurant(int id, String name, String location, int rating, String comment) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.comment = comment;
    }
}
