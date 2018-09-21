package com.gfa.programmerfoxclub.models;

public class Food {

    private String foodName;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Food(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return foodName;
    }
}
