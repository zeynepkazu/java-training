package org.example;

import java.util.*;

public class Main {

    //initialize an input string with words, calls the shuffleCharactersAndCombineWords method, and prints the result.
    public static void main(String[] args) {
        String inputString = "This is an algorithm to make a new word with words that has repeated characters";
        String result = shuffleCharactersAndCombineWords(inputString);
        System.out.println("Randomized characters word: " + result);
    }

    //takes an input string, splits it into an array of words using spaces as separators,
    // and initializes an empty list to store words with repeated characters.
    public static String shuffleCharactersAndCombineWords(String inputString) {
        List<String> wordsWithRepeatedCharacters = new ArrayList<>();
        String[] words = inputString.split("\\s+");

        //loop iterates over each word in the array, and for words with repeated characters
        // it converts the word into a char array and then into a list of characters.
        for (String word : words) {
            if (hasRepeatedCharacters(word)) {
                char[] charArray = word.toCharArray();
                List<Character> charList = new ArrayList<>();
                for (char c : charArray) {
                    charList.add(c);
                }
                Collections.shuffle(charList);
                StringBuilder shuffledWord = new StringBuilder();
                for (char c : charList) {
                    shuffledWord.append(c);
                }
                wordsWithRepeatedCharacters.add(shuffledWord.toString());
            }
        }

        return String.join("", wordsWithRepeatedCharacters);
    }

    //method returns a single string by joining the shuffled words in the list
    public static boolean hasRepeatedCharacters(String word) {
        Set<Character> uniqueCharacters = new HashSet<>();

        for (char c : word.toCharArray()) {
            if (!uniqueCharacters.add(c)) {
                return true; // Word has repeated characters
            }
        }

        return false; // Word does not have repeated characters
    }
}
