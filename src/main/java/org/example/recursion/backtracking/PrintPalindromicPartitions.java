package org.example.recursion.backtracking;

import java.util.ArrayList;

public class PrintPalindromicPartitions {
    public static void main(String[] args) {
        PrintPalindromicPartitions obj = new PrintPalindromicPartitions();

        // Stores all partitions generated at the end
        ArrayList<ArrayList<String>> res = new ArrayList<>();

        String s = "geeks";

        int ind = 0;

        // Store the partition at current iteration
        ArrayList<String> curr = new ArrayList<>();

        // calling funtion to get partition
        obj.partition(res, s, ind, curr);

        for(ArrayList<String> iter : res) {
            System.out.println(iter);
        }
    }
    public void partition(ArrayList<ArrayList<String>> res, String s, int ind, ArrayList<String> curr) {
        // if we reach the end of string
        // add the current list to the result

        if(ind == s.length()) {
            res.add(new ArrayList<String>(curr));
            return;
        }

        // Store the current substring
        String temp = "";

        for(int i = ind; i < s.length(); i++) {
            temp += s.charAt(i);

            // check if string temp is palindrome or not
            if(checkPalindrome(temp)){

                // adds the string to current list
                curr.add(temp);

                // Recursive call for the remaining string
                partition(res, s, i+1, curr);

                // Remove the string from the current list - (backtracking)
                curr.remove(curr.size()-1);
            }
        }

    }
    public boolean checkPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}
