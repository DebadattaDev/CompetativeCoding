package org.example.recursion;

public class SubSequenceString {
    public static void main(String[] args) {
        String str="abc";
        findSubSequence("",str);
    }

    private static void findSubSequence(String s, String str) {
        if(str.isEmpty()){
            System.out.println(s);
            return;
        }
        char c=str.charAt(0);

        findSubSequence(s+c,str.substring(1));
        findSubSequence(s,str.substring(1));

    }
}
