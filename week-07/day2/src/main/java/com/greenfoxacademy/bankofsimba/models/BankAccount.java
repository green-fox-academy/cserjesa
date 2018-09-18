package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {
    String name;
    String animalType;
    int balance;

    public BankAccount(String name, String animalType, int balance) {
        this.name = name;
        this.animalType = animalType;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }
}
