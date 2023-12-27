package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateValidParenthesis {
    public static void main(String args[]){
        int n=3;
        List<String> ls=new ArrayList<>();
        String s="";
        generateParenthesis(n,n,s,ls);
        for(String p:ls){
            System.out.println(p);
        }
    }

    private static void generateParenthesis(int left,int right, String s,List<String> ls) {
        if(left==0 && right==0){
            ls.add(s);
            return;
        }
        if(left>right || left<0 || right<0){
            return;
        }
        s+="(";
        generateParenthesis(left-1,right,s,ls);
        s=s.substring(0,s.length()-1);
        s+=")";
        generateParenthesis(left,right-1,s,ls);
        return;


    }
}
//        n=3
//        ((()))
//        (()())
//        (())()
//        ()(())
//        ()()()
