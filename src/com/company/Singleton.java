package com.company;

public class Singleton {

  static Singleton obj = new Singleton(); // create one static object of the class.
    // Static means no other objects can be created after this.

private Singleton() {
    } // creating new static constructor, so that user cannot use the default one which is public

    public static Singleton getInstance(){
        return obj;
    }// creating static method that returns the object made by this class. Now we can only have one instance of this object
}
