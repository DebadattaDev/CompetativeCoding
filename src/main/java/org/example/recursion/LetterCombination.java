package org.example.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    public static void main(String[] args) {
        Map<Integer,String> mp=new HashMap<>();
        mp.put(2,"abc");
        mp.put(3,"def");
        mp.put(4,"ghi");
        mp.put(5,"jkl");
        mp.put(6,"mno");
        mp.put(7,"pqrs");
        mp.put(8,"tuv");
        mp.put(9,"wxyz");
        String digits="23";
        List<String> ls=new ArrayList<>();
        if(digits!="") {
            findNumberPad(mp,ls, "", digits);
        }
        System.out.println(ls);
    }

    private static void findNumberPad(Map<Integer, String> mp,List<String> ls, String p, String up) {
        if(up.isEmpty()){
            ls.add(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        String s=mp.get(digit);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            findNumberPad(mp,ls,p+ch,up.substring(1));
        }

    }
}
