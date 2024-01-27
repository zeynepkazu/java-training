package org.example;

import java.util.Collection;
import java.util.List;
import java.util.Arrays;

public class JavaStream {
    public static <T> T findElement(Collection<T> myCollection, T elementToFind) {
        return myCollection.stream()
                .filter(element -> element.equals(elementToFind))
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        // Finding element 7 in the list
        List <String> fruitList = Arrays.asList("apple", "banana", "orange");
        String stringResult = findElement(fruitList, "apple");

        if (stringResult != null) {
            System.out.println("Element found: " + stringResult);
        } else {
            System.out.println("Returned value -1");
        }

        // Finding element 7 in the list. Would not find
        List<Integer> numbers = java.util.Arrays.asList(1, 2, 3, 4, 5);
        Integer integerResult = findElement(numbers, 7);

        // Handling the result
        if (integerResult != null) {
            System.out.println("Element found: " + integerResult);
        } else {
            System.out.println("Returned value -1");
        }
    }
}
