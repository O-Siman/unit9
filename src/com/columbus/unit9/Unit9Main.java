package com.columbus.unit9;

import java.util.ArrayList;


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

        Unit9_1Musician musicMan = new Unit9_1Musician("Tom", 25, "Drums");
        Unit9_1Performer performer = new Unit9_1Performer();

        //System.out.println(musicMan.getName());
        //musicMan.playInstrument();
        //musicMan.practice();
        //System.out.println(musicMan.getInstrument());
        //System.out.println(musicMan.getAge());

        Unit9_3OverrideMethods overrideMan = new Unit9_3OverrideMethods("Bob", 45);

        //System.out.println(overrideMan.getName());
        //overrideMan.perform();
        //overrideMan.practice();

        ArrayList<String> oneliners = new ArrayList<String>();
        Unit9_6Entertainer Sally = new Unit9_6Comedian("Satire", oneliners);
        //Is this valid?
        //System.out.println(Sally.getTalent());
        //Why is this not valid?
        //Compile time (Unit9_6Entertainer) vs Run time (Unit9_6Comedian)
        //System.out.println(Sally.tellJoke());


        //We fix it by casting, careful with parenthesis
        //System.out.println(((Unit9_6Comedian) Sally).tellJoke());


        Unit9_7ObjectSuperclass objectStuff = new Unit9_7ObjectSuperclass(10);
        System.out.println(objectStuff);
        System.out.println(objectStuff);

        Unit9_7ObjectSuperclass2 moreObjectStuff = new Unit9_7ObjectSuperclass2(25, "Bob");
        //System.out.println(moreObjectStuff);

        Unit9_7ObjectSuperclass objectStuff2 = new Unit9_7ObjectSuperclass(10);
        //by default .equals checks if the two variables refer to the same object.
        // We want it to check the info inside the object so we override.

        //System.out.println(objectStuff.equals(objectStuff2));

        //How would I add the equals method to Unit9_7ObjectSuperclass2 to compare names too?

    }
}
