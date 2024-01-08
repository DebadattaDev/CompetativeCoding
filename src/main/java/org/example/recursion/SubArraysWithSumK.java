package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubArraysWithSumK {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1};
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        int len=arr.length;
        int k=3;
        findSubArray(k,len,arr,ans,l1,0,0);
        for(List<Integer>i:ans){
            System.out.println(i);
        }
    }

    private static void findSubArray(int k,int len, int[] arr, List<List<Integer>> ans, List<Integer> l1, int index, int sum) {
        if(index==len){
            if(sum==k){
                ans.add(new ArrayList<>(l1));
            }
            return;
        }
        sum+=arr[index];
        l1.add(arr[index]);
        findSubArray(k,len,arr,ans,l1,index+1,sum);
//        System.out.println(index);
        sum-=arr[index];
        l1.remove(l1.size()-1);
        findSubArray(k,len,arr,ans,l1,index+1,sum);

    }
}
