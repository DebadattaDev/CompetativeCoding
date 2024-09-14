package org.example.recursion;

public class findKthBitInNthBinaryString {
    public static void main(String[] args) {
        int n=4;
        int k=11;
//        String res=findNthBit(n);
//        System.out.println(res);
//        System.out.println(res.charAt(k-1));
        System.out.println(findKthBit(n,k));
    }

    private static String findNthBit(int n) {
        if(n==1) {
            return "0";
        }
        String nthBit=findNthBit(n-1);
        String res=nthBit+"1"+reverseAndInvert(nthBit);
        return res;
    }

    private static String reverseAndInvert(String s) {
        int n = s.length();
        StringBuilder inv = new StringBuilder();
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '1'){
                inv.append('0');
            }else{
                inv.append('1');
            }
        }
        inv.reverse();
        return inv.toString();


    }
    //optimal observation

    public static char findKthBit(int n, int k) {
        if(n ==1) return '0';

        int rowLength = (1<<n) - 1;
        int mid = rowLength >> 1;

        //Same as above row
        if(k <= mid){
            return findKthBit(n-1, k);
        }
        //Always 1
        else if(k == mid+1){
            return '1';
        }
        //Inveret from previous row but from start
        else{
            k = rowLength - k +1;
            char ans = findKthBit(n-1, k);
            return ans == '0'? '1' : '0';
        }

    }
}
