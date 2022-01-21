package com.columbus.unit9;

public class Unit9_5References {

    //Subclass demonstrates "is-a" relationship with superclass

    //reference variable is "Polymorphic" when it can refer to objects of
    //different classes at different points in the code.

    //A reference variable can store references to its declared class
    //or to any subclass of its declared class.


    //regular
    WritingUtensil wu = new WritingUtensil();
    //new
    WritingUtensil mar = new Marker(); //Marker "is-a" WritingUtensil
    WritingUtensil mar2 = new Pen(); //Pen "is-a" WritingUtensil
    Pen mar3 = new GelPen(); ////gelPen "is-a" Pen
    WritingUtensil mar4 = new GelPen(); //gelPen "is-a" WritingUtensil

    public class WritingUtensil {
    }

    public class Marker extends WritingUtensil {
    }

    public class Pen extends WritingUtensil {
    }

    public class GelPen extends Pen {
    }


    //Why?

    //Array or ArrayList that contains different types of objects.

//	WritingUtensil [] pencilCase = new WritingUtensil[3];
//	pencilCase[0] = new Pen();
//	pencilCase[1] = new gelPen();
//	pencilCase[2] = new Marker();

    //Allows you to call different overriding methods.

    //The methods called will always be from the subclass.

    //You can also use the superclass as a method parameter so that the
    //method can take in any of the subclass objects.

//	public void displaytext(WritingUtensil wu, String text) {
//		//in this case wu can be any object from the superclass or any of its 
//		//subclasses (Marker, Pen of gelPen)
//	}


}
