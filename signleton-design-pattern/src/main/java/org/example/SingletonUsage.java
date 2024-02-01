package org.example;

public class SingletonUsage {
    public static void main(String[] args) {
        // Getting the singleton instance
        Singleton mySingletonInstance = Singleton.getInstance();

        // Using the singleton instance
        mySingletonInstance.showMessage();
    }
}
