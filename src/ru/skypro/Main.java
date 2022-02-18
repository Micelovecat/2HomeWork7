package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("abc", "cde", "cde", "last"));

        printEvenNumbers(nums);
        printSortedUniqueOddNumbers(nums);
        printUniqueWords(words);
        printDuplicatesWords(words);
    }

    private static void printDuplicatesWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.print("Duplicates Words: ");
        System.out.print(words.size() - uniqueWords.size());
    }

    private static void printUniqueWords(List<String> words) {
        System.out.print("Unique words: ");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.print(uniqueWords);
        System.out.println("");
    }

    private static void printSortedUniqueOddNumbers(List<Integer> nums) {
        System.out.print("printSortedUniqueOddNumbers: ");
        Set<Integer> uniqueSortedNums = new TreeSet<>(nums);
        for (int num : uniqueSortedNums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("");
    }

    private static void printEvenNumbers(List<Integer> nums) {
        System.out.print("printEvenNumbers: ");
        for (int num: nums){
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("");
    }
}
