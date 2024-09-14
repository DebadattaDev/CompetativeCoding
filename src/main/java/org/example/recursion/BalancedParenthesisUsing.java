package org.example.recursion;

public class BalancedParenthesisUsing {
    public static void main(String[] args) {
        String exp="[({{}})]";
        int len=exp.length()-1;
        boolean isValid=checkParenthesis(exp, 0,0,0,0);
        System.out.println(isValid);
    }

    private static boolean checkParenthesis(String exp, int ind, int i, int i1, int i2) {
        if(exp.length()==0 && i==0 && i1==0 && i2==0){
            return true;
        }
        if(exp.length()==0 && i!=0 || i1!=0 || i2!=0){
            return false;
        }

        return exp.charAt(0)=='{' ?
                checkParenthesis(exp.substring(1), ind,++i,i1,i2) :
                exp.charAt(0)=='}' ?
                        checkParenthesis(exp.substring(1), ind,--i,i1,i2) :
                        exp.charAt(0)=='[' ?
                                checkParenthesis(exp.substring(1), ind,i,++i1,i2) :
                                exp.charAt(0)==']' ?
                                        checkParenthesis(exp.substring(1), ind,i,--i1,i2) :
                                        exp.charAt(0)=='(' ?
                                                checkParenthesis(exp.substring(1), ind,i,i1,++i2) :
                                                        checkParenthesis(exp.substring(1), ind,i,i1,--i2);

    }
}
