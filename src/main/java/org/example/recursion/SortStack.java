package org.example.recursion;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(5);
        s.push(3);
        s.push(4);
        sortStack(s);
        while(s.size()>0){
            int top=s.peek();
            System.out.println(top);
            s.pop();
        }

    }

    private static void sortStack(Stack<Integer> s) {
        if(!s.isEmpty()){
            int x=s.pop();
            sortStack(s);
            sortedInsert(s,x);
        }

    }

    private static void sortedInsert(Stack<Integer> s, int x) {
        if(s.isEmpty() || x>s.peek()){
            s.push(x);
            return;
        }
        int top=s.pop();
        sortedInsert(s,x);
        s.push(top);
    }
}
