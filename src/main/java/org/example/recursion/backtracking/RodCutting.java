package org.example.recursion.backtracking;
import java.util.Arrays;

public class RodCutting {


        // Function to solve Rod Cutting problem using recursion with memoization
        public static int rodCutting(int[] price, int n, int[] memo) {
            // Base case: if the length of the rod is 0, no revenue is possible
            if (n == 0) {
                return 0;
            }

            // If the value has already been computed, return it
            if (memo[n] != -1) {
                return memo[n];
            }

            // Initialize maxRevenue to the lowest possible value
            int maxRevenue = Integer.MIN_VALUE;

            // Recursively try all possible cuts
            for (int i = 1; i <= n; i++) {
                // Calculate the revenue of making a cut of length i
                int revenue = price[i - 1] + rodCutting(price, n - i, memo);

                // Update maxRevenue if the current revenue is higher
                maxRevenue = Math.max(maxRevenue, revenue);
            }

            // Store the computed result in memo array
            memo[n] = maxRevenue;

            // Return the maximum revenue obtained
            return maxRevenue;
        }

        public static void main(String[] args) {
            // Example: Prices for rod lengths 1, 2, 3, ..., n
            int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
            int length = 8;

            // Create a memoization array and initialize it to -1
            int[] memo = new int[length + 1];
            Arrays.fill(memo, -1);

            int maxProfit = rodCutting(price, length, memo);
            System.out.println("Maximum profit: " + maxProfit);
        }
    }


