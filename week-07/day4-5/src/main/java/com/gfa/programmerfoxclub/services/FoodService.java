package com.gfa.programmerfoxclub.services;

import com.gfa.programmerfoxclub.models.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {
    public FoodService() {
        this.foodList = new ArrayList<>();
        foodList.add(new Food("Tás"));
        foodList.add(new Food("Unka"));
        foodList.add(new Food("Chicken"));
    }

    private ArrayList<Food> foodList;

    public void addFood(String foodName){
        Food food = new Food(foodName);
        foodList.add(food);
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }
}
