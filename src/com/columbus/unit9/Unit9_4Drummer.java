package com.columbus.unit9;

public class Unit9_4Drummer extends Unit9_1Musician {

    private final String name = "Bob";
    private final String intrument = "drums";

    public Unit9_4Drummer(String n, int a) {
        super(n, a);
    }

    public String getName() {
        super.getName();
        return name;
    }

}
