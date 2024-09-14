package org.example.LinkedList;

public class ReverseLL {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }

    public static void main(String[] args) {
        ReverseLL obj=new ReverseLL();
        obj=insert(obj,1);
        obj=insert(obj,2);
        obj=insert(obj,3);
        printLL(obj);
//        Node rev=reverse(obj);
//        printReverseLL(rev);
        //Reverse by Recursion
        Node p=obj.head;
        Node revRe=reverseByRecursion(p);
        printReverseLL(revRe);
    }

    private static Node reverseByRecursion(Node p) {
        if(p==null || p.next==null){
            return p;
        }
        Node temp=p.next;
        p.next=null;
        Node head=reverseByRecursion(temp);
        temp.next=p;
        return head;
    }

    private static void printReverseLL(Node rev) {
//        Node curr=rev.next;
        System.out.println("After Reverse:---");
        while(rev!=null){
            System.out.println(rev.data);
            rev=rev.next;
        }
    }

    private static Node reverse(ReverseLL obj){
        Node curr=obj.head;
        Node temp;
        Node prev=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    private static void printLL(ReverseLL obj) {
        System.out.println("Before Reverse:----");
        Node temp=obj.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    private static ReverseLL insert(ReverseLL obj, int i) {
        Node newNode=new Node(i);
        if(obj.head==null){
            obj.head=newNode;
        }else{
            Node temp=obj.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        return obj;

    }

}
