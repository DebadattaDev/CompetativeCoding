package org.example.recursion;

public class RemovString {
    public static void main(String[] args) {
        System.out.println( removeApple("bccapplefdg"));
    }

    private static String removeApple( String res) {
        if(res.isEmpty()){
            return "";
        }
        if(res.startsWith("apple")){
            return removeApple(res.substring(5));
        }else{
            return res.charAt(0) + removeApple(res.substring(1));
        }
    }
}
