package org.example;

public class Main {
    public static void main(String[] args) {
        String myString = "This is my string with some words";
        int count;

        // Make the string char array
        char[] string = myString.toCharArray();
        System.out.println("Repeated characters are: ");

        // Initialize a string with repeated chars
        StringBuilder newWord = new StringBuilder();

        // Chooses a char and initializes variable count by 1.
        for(int i = 0; i < string.length; i++) {
            count = 1;

            // Compares the selected char with the rest.
            for(int j = i+1; j < string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j] = '0';

                    // Add the repeated character to the new word, don't include 0
                    if (string[i] != '0') {
                        newWord.append(string[i]);
                    }
                }
            }

            // If count is greater than 1, then char is repeated
            if(count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }

        // Print the new word
        System.out.println("New Word: " + newWord.toString());
    }
}

