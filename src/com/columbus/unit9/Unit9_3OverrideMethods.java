package com.columbus.unit9;

public class Unit9_3OverrideMethods extends Unit9_1Performer {

    //Same method name as the one in the Superclass performer

    public Unit9_3OverrideMethods(String n, int a) {
        super(n, a);
    }

    public void perform() {
        System.out.println("Overriding this from Performer.");
    }


    //using super Keyword.
    public void practice() {
        super.perform();
        System.out.println("I don't want to practice.");

    }


}
