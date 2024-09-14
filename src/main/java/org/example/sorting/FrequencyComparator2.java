package org.example.sorting;

import java.util.*;

public class FrequencyComparator2 {
    public static List<Integer>FrequencyComparator(List<Integer>arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer a: arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        Comparator<Integer>compares= (o1, o2) -> {
            int frequencyCompare=map.get(o1).compareTo(map.get(o2));
            if(frequencyCompare !=0){
                return frequencyCompare;
            }else{
                return o1.compareTo(o2);
            }
        };
        Collections.sort(arr,compares);
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,1,2,2,2,3);
        List<Integer>sortedList=FrequencyComparator(arr);
        System.out.println(sortedList.toString());

    }
}
