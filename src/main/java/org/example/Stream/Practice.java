package org.example.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,4,5);
        int sumSquare=ls.stream().mapToInt(i->i*i).sum();
        System.out.println(sumSquare);

        List<String>s=Arrays.asList("f","Fruit","Apple","Cucu","a","b");
        List<String>ans=s.stream().filter(i->i.length() > 3).sorted().collect(Collectors.toList());
        System.out.println(ans.toString());
        Map<String,Integer> mp=ans.stream().collect(Collectors.toMap(i->i, i->i.length()));
        System.out.println(mp.toString());
        Optional<Integer> maxi=ls.stream().max((a, b)->a.compareTo(b));
        System.out.println(maxi);
        Map<Boolean,List<Integer>>grpby=ls.stream().collect(Collectors.groupingBy(i->i%2==0));
        System.out.println(grpby);
        List<String>rev=ans.stream().map(i->new StringBuilder(i).reverse().toString()).collect(Collectors.toList());
        System.out.println(rev);
        List<String>occurance=Arrays.asList("apple","orange","apple","orange","apple");
        Map<String,Long>mp1=occurance.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(mp1.toString());
        s.stream().map(a->new StringBuilder(a).reverse().toString());
        Optional<Integer>ans1=ls.stream().reduce((a,b)->a*b);
        List<Integer>ans2=ls.stream().sorted().collect(Collectors.toList());
        ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        ls.stream().reduce((a,b)->a>b ? a:b);
        ls.stream().filter((i)->i>3).sorted().collect(Collectors.toList());

    }
}
