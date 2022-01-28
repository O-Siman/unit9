package com.columbus.unit9;

public class Unit9_7ObjectSuperclass2 extends Unit9_7ObjectSuperclass {

    private final String name;

    public Unit9_7ObjectSuperclass2(int a, String n) {
        super(a);
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return super.getAge();
    }

    public String toString() {
        String fromSuper = super.toString(); // get the age info
        fromSuper += "\n"; // Add line
        fromSuper += "Name: " + name; // Add Name info
        return fromSuper;


    }

    public boolean equals(Object other) {

        if (!(other instanceof Unit9_7ObjectSuperclass2)) {
            return false;
        }

        Unit9_7ObjectSuperclass2 that = (Unit9_7ObjectSuperclass2) other;
        return super.equals(that) && this.name.equals(that.name);

    }

}
