package com.columbus.unit9;

import java.util.ArrayList;

public class Unit9_6Comedian extends Unit9_6Entertainer {

    private final ArrayList<String> jokes;

    public Unit9_6Comedian(String t, ArrayList<String> jks) {
        super(t);
        jokes = jks;
    }

    public String getTalent() {
        //you can use super methods
        return "Comedy Style: " + super.getTalent();
    }

    public String tellJoke() {
        return jokes.get((int) (Math.random() * jokes.size()));
    }

}
