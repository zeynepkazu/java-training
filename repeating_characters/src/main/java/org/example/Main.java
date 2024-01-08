package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String inputString = "This is an algorithm to make a new word with words that has repeated characters";
        String result = shuffleCharactersAndCombineWords(inputString);
        System.out.println("Randomized characters word: " + result);
    }

//take an input string, split it into an array of words using spaces as separators
// and initialize an empty list to store words with repeated characters
    public static String shuffleCharactersAndCombineWords(String inputString) {
        List<String> wordsWithRepeatedCharacters = new ArrayList<>();
        String[] words = inputString.split("\\s+");

//count is initialized to 0 to keep track of the number of words with repeated characters. The loop iterates over each word in the array,
// and for words with repeated characters it converts the word into a char array and then into a list of characters.

        int count = 0; // Counter to limit the number of words with repeated characters
        for (String word : words) {
            if (hasRepeatedCharacters(word)) {
                char[] charArray = word.toCharArray();
                List<Character> charList = new ArrayList<>();
                for (char c : charArray) {
                    charList.add(c);
                }

//The characters in the list are shuffled using Collections.shuffle
                Collections.shuffle(charList);
                StringBuilder shuffledWord = new StringBuilder();
                for (char c : charList) {
                    shuffledWord.append(c);
                }

                wordsWithRepeatedCharacters.add(shuffledWord.toString());
                count++;

                if (count == 2) {
                    break; // Stop after two words with repeated characters
                }
            }
        }
//return a single string by joining the shuffled words in the list without separator.
        return String.join("", wordsWithRepeatedCharacters);
    }

//checks if a word has repeated characters and adds them into the set.
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
