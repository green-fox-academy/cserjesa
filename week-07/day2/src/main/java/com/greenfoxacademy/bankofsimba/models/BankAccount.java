package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {
    String name;
    String animalType;
    Integer balance;
    Boolean isKing;
    Boolean isGood;

    public BankAccount(String name, String animalType, Integer balance, Boolean isKing, Boolean isGood) {
        this.name = name;
        this.animalType = animalType;
        this.balance = balance;
        this.isKing = isKing;
        this.isGood = isGood;
    }

    public String getName() {
        return name;
    }

    public boolean isGood() {
        return isGood;
    }

    public boolean isKing() {
        return isKing;
    }

    public int getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void raiser(Integer amount) {
        this.balance = this.balance + amount;
    }
}
