package org.example.recursion;

public class Permutations {
    public static void main(String[] args) {
        String str="abc";
        findPermutations("",str);
    }

    private static void findPermutations(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i);
            findPermutations(f+ch+s,up.substring(1));
        }
    }
}
