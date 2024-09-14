package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersAfterPrimePWithSumS {
    public static void main(String[] args) {
        findPrimes(3,2,23,new ArrayList<>());
    }

    private static List<Integer> findPrimes(int n, int p, int s, List<Integer> ls) {
        if(n==0){

        }
        if(checkNumberPrime(p+1)){
            ls.add(p+1);
        }
        findPrimes(n--,p+1,s,ls);
        ls.remove(ls.size()-1);
        return ls;
    }

    private static boolean checkNumberPrime(int i) {
        int m=i/2;
        boolean flag=false;
        if(i==0 || i==1){
            return false;
        }else{
            for(int j=2;j<=m;j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                return true;
            }else{
                return false;
            }
        }
    }
}
