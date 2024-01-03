package org.example.recursion;

public class GenerateAllSubsequence {
    public static void main(String args[]){
        String str="abc";
        String f="";
        generateSubsequence(str,f,0);

    }

    private static void generateSubsequence(String str, String f , int i) {
        if(i== str.length()){
            System.out.println(f);
            return;
        }

        generateSubsequence(str,f+str.charAt(i),i+1);
//        System.out.println(f+" "+i);
        generateSubsequence(str,f,i+1);
    }
}
