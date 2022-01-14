package com.columbus.unit9;

//Inheritance - build a hierarchy of classes that share characteristics.

//Superclass - parent
//Subclass - child (inherits all methods and attributes without duplicating code)

//Reasons

//Code reusability
//High level classes can be used in many situations.

//Prevent repeating code
//Common methods and variables are all in one place

//Organization
//Organized structure in your classes allows for easy identification.
//Also easier error correction

//Ease of maintenance
//When you want to change something you can easily find it.
//It is also faster to make changes if you only have to do it once in the parent class

public class Unit9Main {
    public static void main(String[] args) {
        Unit9_1Musician musicMan = new Unit9_1Musician();
        musicMan.perform();
        System.out.println(musicMan.getName());
        System.out.println(musicMan.getInstrument());
    }
}
