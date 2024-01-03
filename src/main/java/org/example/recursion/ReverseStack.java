package org.example.recursion;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);
        while(s.size()>0){
            int top=s.peek();
            System.out.println(top);
            s.pop();
        }
    }

    private static void reverseStack(Stack<Integer> s) {
        if(s.size()>0){
            int top=s.peek();
            s.pop();
            reverseStack(s);
            insertFromLast(s,top);
        }
    }

    private static void insertFromLast(Stack<Integer> s, int top) {
        if(s.isEmpty()){
            s.push(top);
        }else {
            int x = s.peek();
            s.pop();
            insertFromLast(s, top);
            s.push(x);
        }
    }
}
