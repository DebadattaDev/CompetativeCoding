package org.example.recursion;

import java.util.ArrayList;
import java.util.*;

public class CombinationSum3 {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        int k=3;
        int target=9;
        findTarget(ls,k,target,0);
    }

    private static void findTarget(List<Integer> ls, int k, int target,int ind) {
        if(k==ls.size()){
            if(target==0){
                System.out.println(ls.toString());
            }
            return;
        }

        for(int i=ind+1;i<=9;i++){

                ls.add(i);
                findTarget(ls, k, target - i,i);
                ls.remove(ls.size() - 1);
        }
    }
}
