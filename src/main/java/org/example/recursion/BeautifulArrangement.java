package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class BeautifulArrangement {
    public static void main(String[] args) {
        int n=3;
        int count=0;
        List<Integer> ls=new ArrayList<>();
        boolean freq[]=new boolean[n];
        int res=findPermutation(n,ls,count,freq);
        System.out.println(res);
    }

    private static int findPermutation(int n, List<Integer>arr,int count,boolean freq[]) {
        if(n==arr.size()){
            int i=1;
            boolean flag=false;
            System.out.println(arr.toString());
            for(int j:arr){
                if(j%i!=0 || i%j!=0){
                    flag=true;
                    break;
                }
                i++;
            }
            if(!flag){
                System.out.println("coming");
                return 1;
            }else {
                return 0;
            }
        }
        for(int i=0;i<n;i++){
            if(!freq[i]) {
                freq[i]=true;
                arr.add(i+1);
                int res=findPermutation(n,arr,count,freq);
                System.out.println(res);
                if(res==1){
                    count++;
                }
                arr.remove(arr.size()-1);
                freq[i]=false;
            }

        }
        return count;
    }
}
