package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllBinStringOfNBits {
    public static void main(String args[]){
        int n=4;
        List<String> ls=new ArrayList<>();
        char []ch=new char[n];
        GeneratePosibility(n,ls,ch);
        for(String i:ls){
            System.out.println(i);
        }
    }

    private static void GeneratePosibility(int n, List<String> ls,char ch[]) {
        if(n<=0){
            return;
        }
        ch[0]='0';
        GeneratePossibleString(n,ls,1,ch);
        ch[0]='1';
        GeneratePossibleString(n,ls,1,ch);


    }

    private static void GeneratePossibleString(int n, List<String> ls, int k, char[] ch) {
        if(n==k){
//            System.out.println(n+" "+k);
            convertToString(ch,ls);
            return;

        }
        if(ch[k-1]=='0'){
            ch[k]='1';
            GeneratePossibleString(n,ls,k+1,ch);

            ch[k]='0';
            GeneratePossibleString(n,ls,k+1,ch);
        }
        if(ch[k-1]=='1'){
            ch[k]='0';
            GeneratePossibleString(n,ls,k+1,ch);
        }

    }

    private static void convertToString(char[] ch, List<String> ls) {
        String a=new String(ch);
        ls.add(a);

    }
}
