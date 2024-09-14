package org.example.recursion;

public class countGoodNumber {
    public static void main(String[] args) {
        long n=4;
        System.out.println(countGood(n));
    }

    private static int countGood(long n) {
        long odd = n/2; //It gives the number of odd indices starting from 1 to n.
        long even = (n+1)/2; //It gives number of even indices. It is basically n/2 + n%2;
        return (int)(power(5, even)*power(4, odd)); //As there are 4 prime numbers and 5 even numbers
        // from 0 to 9.
    }
    public static long power(long x, long n) {

        if(n==0) return 1;

        long temp = power(x,n/2);

        if(n%2==0){
            return (temp*temp);
        }
        else{
            return (x*temp*temp);
        }
    }
}
