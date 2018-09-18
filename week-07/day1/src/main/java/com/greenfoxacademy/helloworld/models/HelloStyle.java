package com.greenfoxacademy.helloworld.models;

import java.util.Random;

public class HelloStyle {
    String text;
    String randomColor;
    int fontSize;

    public HelloStyle(String text) {
        this.text = text;
        this.randomColor = randomColor();
        this.fontSize = randomFontSite();
    }

    private int randomFontSite() {
        return random.nextInt(440) + 90;
    }

    Random random = new Random();

    String randomColor() {
        Integer r = random.nextInt(255) + 1;
        Integer g = random.nextInt(255) + 1;
        Integer b = random.nextInt(255) + 1;
        return Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
    }

    public String getText() {
        return text;
    }

    public String getRandomColor() {
        return randomColor;
    }

    public int getFontSize() {
        return fontSize;
    }
}