package org.example.recursion;

public class RemoveCharacter {
    public static void main(String[] args) {
        RemoveA("","debAdAttA");
    }

    private static void RemoveA(String p, String up) {
        if(up.isEmpty()){
            System.out.print(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='A'){
            RemoveA(p,up.substring(1));
        }
        else{
            RemoveA(p+ch,up.substring(1));
        }
    }
}
