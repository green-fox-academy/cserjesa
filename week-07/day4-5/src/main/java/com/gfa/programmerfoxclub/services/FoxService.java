package com.gfa.programmerfoxclub.services;

import com.gfa.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    public List<String> foxList = new ArrayList<>();


    public void addFox(String name) {
        foxList.add(name);
        Fox fox = new Fox(name);
        return;
    }

    public Boolean isNewFox(String name) {
        for (String foxName : foxList) {
            if (foxName.equals(name))
                return false;
        }
        return true;
    }
}