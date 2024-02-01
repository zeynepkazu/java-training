package org.example;

public class Singleton {

    // Private instance variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
        // Initialization code, if any
    }

    // Public method to get the single instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Additional methods of the singleton class

    public void showMessage() {
        System.out.println("Hi, I am a Singleton!");
    }
}
