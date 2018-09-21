package com.gfa.programmerfoxclub.models;

public class Drink {
    private String drinkName;

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }
}
