package com.columbus.unit9;

public class Unit9_7ObjectSuperclass {

    //Object is the superclass of all objects in Java
    //By default every class -extends Object-

    //The main two methods you use from this superclass are:
    // .equals() returns boolean
    // .toString() returns String (this is what happens when you try to print the object)
    // Subclasses can override these methods if needed.

    private final int age;

    public Unit9_7ObjectSuperclass(int a) {
        age = a;
    }

    public int getAge() {
        return age;

    }

    public String toString(int a) {
        return "Age: " + age;
    }

    public boolean equals(Object other) {
        //Use instance of to make sure the objects you are comparing are of the same class.
        if (!(other instanceof Unit9_7ObjectSuperclass)) {
            return false;
        }
        //Cast other to Unit9_7ObjectSuperclass instead of default Object class
        Unit9_7ObjectSuperclass that = (Unit9_7ObjectSuperclass) other;

        //Compare the variables inside these objects
        // Remember that the -this- keyword refers to the current object
        return this.age == that.age;


    }


}
