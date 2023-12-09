package exercise29;

import java.util.function.Predicate;

public class GenericPartOf {

    public static <T> double partOf(T[] array, Predicate<T> condition) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        int countSatisfying = 0;
        for (T item : array) {
            if (condition.test(item)) {
                countSatisfying++;
            }
        }

        return ((double) countSatisfying / array.length) * 100.0;
    }

    public static void main(String[] args) {
        // Example usage with an array of integers
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Predicate<Integer> isEven = n -> n % 2 == 0;
        double percentageEven = partOf(intArray, isEven);
        System.out.println("Percentage of even numbers: " + percentageEven + "%");

        // Example usage with an array of strings
        String[] strArray = {"apple", "banana", "orange", "grape", "kiwi"};
        Predicate<String> startsWithA = s -> s.startsWith("a");
        double percentageStartsWithA = partOf(strArray, startsWithA);
        System.out.println("Percentage of strings starting with 'a': " + percentageStartsWithA + "%");
    }
}
