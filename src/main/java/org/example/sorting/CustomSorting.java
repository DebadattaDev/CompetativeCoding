package org.example.sorting;

import java.util.*;

public class CustomSorting {
    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";

        // Initialize rank array with a default high value
        int rank[] = new int[26];
        Arrays.fill(rank, Integer.MAX_VALUE);

        // Set the rank for characters present in the order string
        for (int i = 0; i < order.length(); i++) {
            rank[order.charAt(i) - 'a'] = i;
        }

        // Create a list of characters from the input string
        List<Character> charList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            charList.add(c);
        }

        // Sort the list of characters using a custom comparator
        charList.sort((o1, o2) -> {
            int rank1 = rank[o1 - 'a'];
            int rank2 = rank[o2 - 'a'];
            return Integer.compare(rank1, rank2);
        });

        // Build the sorted string from the sorted list of characters
        StringBuilder sortedString = new StringBuilder();
        for (char c : charList) {
            sortedString.append(c);
        }

        // Print the sorted string
        System.out.println(sortedString.toString());
    }
}
