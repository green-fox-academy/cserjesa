package com.gfa.hellodi.services;

import org.springframework.stereotype.Service;

//@Service
public class Fuchsia implements MyColor {
    @Override
    public void printColor() {
        System.out.println("FUCHSIA");
    }
}
