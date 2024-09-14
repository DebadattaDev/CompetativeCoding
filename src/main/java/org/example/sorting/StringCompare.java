package org.example.sorting;

 class pair <F,S>{
    private F first;
    private S second;

    public pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }
}

public class StringCompare{
    public static void main(String[] args) {
        String s="cba";
        String t="abdc";
        int arr[]=new int[26];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<s.length();i++){
            int diff=s.charAt(i)-'a';
//            arr[diff]=
        }
    }
}


