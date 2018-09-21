package com.gfa.programmerfoxclub.services;

import com.gfa.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    private List<Fox> foxList = new ArrayList<>();


    public void addFox(String name) {
        Fox fox = new Fox(name);
        foxList.add(fox);
    }

    public Boolean isNewFox(String name) {
        for (Fox fox : foxList) {
            if (fox.getName().equals(name))
                return false;
        }
        return true;
    }

    public Fox getFoxByName(String name) {
        for (Fox fox : foxList) {
            if (fox.getName().equals(name))
                return fox;
        }
        return null;
    }
}