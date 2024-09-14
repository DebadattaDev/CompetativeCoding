package org.example.recursion;

import java.util.*;

public class NDigitNumbersInIncreasingOrder {
    public static void main(String[] args) {
        int n=1;
        List<Integer>ls=new ArrayList<>();
        List<Integer>res=new ArrayList<>();
        if(n==1){
            for(int i=0;i<=9;i++){
                res.add(i);
            }
        }else {
            findNthDigit(n, ls, res);
        }
        for(int i:res){
            System.out.println(i);
        }
    }

    private static void findNthDigit(int n,List<Integer>ls,List<Integer>res) {
        if(n==0){
            int ans=0;
            for(int i=0;i<ls.size();i++){
                ans=ans*10+ls.get(i);
            }
            res.add(ans);
            return;
        }
        for(int i=1;i<=9;i++){
            if(ls.size()==0 || i>ls.get(ls.size()-1)){
                ls.add(i);
                findNthDigit(n-1,ls,res);
                ls.remove(ls.size()-1);
            }
        }
    }
}
