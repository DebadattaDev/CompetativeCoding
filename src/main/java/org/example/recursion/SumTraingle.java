package org.example.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTraingle {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        printRes(arr);
    }

    private static void printRes(List<Integer> arr) {

            List<Integer>calculation=new ArrayList<>();
            List<List<Integer>>res=new ArrayList<>();
            res.add(sumTraiangle(arr,calculation,0,1));

            for(List<Integer> i:res){
                System.out.println(i);
            }

            if(calculation.size()>=1){
                printRes(calculation);
            }
        }


    private static List<Integer> sumTraiangle(List<Integer> arr,List<Integer> calculation, int i, int j) {

        if(j>=arr.size()) {
            return arr;
        }
        int sum=arr.get(i)+arr.get(j);
        calculation.add(sum);
        return sumTraiangle(arr,calculation,++i,++j);
    }
}
