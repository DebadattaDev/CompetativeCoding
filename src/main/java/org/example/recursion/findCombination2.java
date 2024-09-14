package org.example.recursion;

import java.util.ArrayList;
import java.util.List;
public class findCombination2 {
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        int len=arr.length;
        findUniqueCombination(target,arr,ans,l1,0,len);
        for(List<Integer>i:ans){
            System.out.println(i);
        }
    }

    private static void findUniqueCombination(int target, int[] arr, List<List<Integer>> ans, List<Integer> l1, int ind,int len) {
            if(target==0){
                ans.add(new ArrayList<>(l1));
                return;
            }
        for(int i=ind;i<=len;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            l1.add(arr[i]);
            findUniqueCombination(target-arr[i],arr,ans,l1,ind,len);
            l1.remove(l1.size()-1);

        }

    }


}
