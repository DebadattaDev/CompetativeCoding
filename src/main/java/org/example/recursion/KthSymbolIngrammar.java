package org.example.recursion;

public class KthSymbolIngrammar {
    public static void main(String[] args) {
        int n=4;
        int k=3;
//        String res=kthGrammar(n,k);
//        System.out.println(res);
//        System.out.println(res.charAt(k-1)-'0');
        System.out.println(k1thGrammar(n,k));
    }

    private static String kthGrammar(int n, int k) {
        if(n==1){
            return "0";
        }
        String res= kthGrammar(n-1,k);
        StringBuilder op=new StringBuilder();
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='0'){
                op.append("01");
            }else{
                op.append("10");
            }
        }
        return op.toString();

    }
        public static int k1thGrammar(int n, int k) {
            if(n == 1 && k == 1) return 0;  //base case

            int len = (int)Math.pow(2,n - 1);  //total number of bits in nth row
            int mid = len/2;            //mid(1 based indexing)
            if(k <= mid){               //if k<= mid than ans of nth and n - 1th row is same
                return k1thGrammar(n - 1,k);
            }else{
                return 1 - k1thGrammar(n - 1,k - mid);
                //nth row kth col ans is Complement of (n - 1)th row k - mid col
            }
        }

//This questions is purely Observation based Question
/*
Observation: first half of row is same as prev row and other half is complement of previous row

N == 1   0
N == 2   0 1
N == 3   0 1 1 0
N == 4   0 1 1 0 1 0 0 1
N == 5   0 1 1 0 1 0 0 1 1 0 0 1 0 1 1 0

*/
}
