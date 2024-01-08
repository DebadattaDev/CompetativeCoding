package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class findCombination {
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int target=7;
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        int len=arr.length;
        findUniqueCombination(target,arr,ans,l1,0,len);
        for(List<Integer>i:ans){
            System.out.println(i);
        }
    }

    private static void findUniqueCombination(int target, int[] arr, List<List<Integer>> ans, List<Integer> l1, int i,int len) {
        if(i==len){
            if(target==0){
                ans.add(new ArrayList<>(l1));
            }
            return;
        }
        if(arr[i]<=target){
            l1.add(arr[i]);
            findUniqueCombination(target-arr[i],arr,ans,l1,i,len);
            l1.remove(l1.size()-1);
        }
        findUniqueCombination(target,arr,ans,l1,i+1,len);

    }


}
