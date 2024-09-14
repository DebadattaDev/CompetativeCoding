package org.example.recursion;

public class removeConsecutiveDuplicates {
    public static void main(String[] args) {
        findUnique("","aaabbbccc",0);

    }

    private static void findUnique(String p, String up, int curIndex) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c=up.charAt(0);
        if(p.isEmpty()){
            findUnique(p+c,up.substring(1),curIndex);
        }else if(p.charAt(curIndex)!=c){
            findUnique(p+c,up.substring(1),++curIndex);
        }else{
            findUnique(p,up.substring(1),curIndex);
        }
    }
}
