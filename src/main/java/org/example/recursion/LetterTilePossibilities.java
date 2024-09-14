package org.example.recursion;

public class LetterTilePossibilities {
    public static void main(String[] args) {
        String tiles="AB";
        System.out.println(numberTilesPossibilities(tiles));
    }

    private static int numberTilesPossibilities(String tiles) {
        int count[]=new int[2];
        for (char c : tiles.toCharArray()) count[c - 'A']++;
        return dfs(count);
    }

    private static int dfs(int[] arr) {
        int sum=0;
        for (int i = 0; i < 2; i++) {
            if (arr[i] == 0) continue;
            sum++;
            arr[i]--;
            sum += dfs(arr);
            arr[i]++;
        }
        return sum;
    }
}
