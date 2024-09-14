package org.example.recursion;

import java.util.ArrayList;

public class SubsequnceNumberArray {
    public static void main(String[] args) {
//        List<Integer> arr= Arrays.asList(1,2,3);
        int arr[]={1,2,3};
        findSubSet(arr,0,new ArrayList<>());
    }

    private static void findSubSet(int []arr, int index,ArrayList<Integer> subArray) {
//        System.out.println(arr.length);
        if(index==arr.length){
            System.out.println(subArray.toString());
            return;
        }
        int val=arr[index];
        subArray.add(val);
        findSubSet(arr,index+1,subArray);
        subArray.remove(subArray.size()-1);
        findSubSet(arr,index+1,subArray);
    }
}
