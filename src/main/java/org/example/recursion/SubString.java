package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubString {
    public static void main(String[] args) {
        String str="abc";
        List<String> s=new ArrayList<>();
        findSubString(str,0,s);
        System.out.println(s.toString());

    }

    private static void findSubString(String str, int i, List<String> s) {
        if(str.length()==i){
            return;
        }
        for(int j=i+1;j<=str.length();j++){
            s.add(str.substring(i,j));
        }
        findSubString(str,i+1,s);
    }
}
