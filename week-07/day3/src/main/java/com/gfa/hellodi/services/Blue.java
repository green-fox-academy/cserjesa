package com.gfa.hellodi.services;

import org.springframework.stereotype.Service;

//@Service
public class Blue implements MyColor {
    @Override
    public void printColor() {
        System.out.println("I'm blue");
    }
}
