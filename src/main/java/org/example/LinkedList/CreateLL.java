package org.example.LinkedList;

public class CreateLL {
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static void main(String args[]){
        CreateLL obj=new CreateLL();
        obj=insert(obj,1);
        obj=insert(obj,2);
        obj=insert(obj,3);
        printLL(obj);

    }

    private static void printLL(CreateLL obj) {
        Node curr_node=obj.head;
        while(curr_node!=null){
            System.out.println(curr_node.data);
            curr_node=curr_node.next;
        }
    }

    private static CreateLL insert(CreateLL obj, int i) {
        Node node=new Node(i);
        if(obj.head==null){
            obj.head=node;
        }else{
            Node last=obj.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=node;
        }
        return obj;
    }

}
