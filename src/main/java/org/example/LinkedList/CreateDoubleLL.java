package org.example.LinkedList;

public class CreateDoubleLL {
    Node head;
    static class Node{
        int item;
        Node prev;
        Node next;
        Node(int data){
            this.item=data;
            this.prev=null;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        CreateDoubleLL obj=new CreateDoubleLL();
        obj=insert(obj,1);
        obj=insert(obj,2);
        obj=insert(obj,3);
        printDoubleLL(obj);
    }

    private static void printDoubleLL(CreateDoubleLL obj) {
        Node currNode=obj.head;
        Node reverse=null;
        if(currNode==null){
            return;
        }
        while(currNode!=null){
            System.out.println(currNode.item);
            if(currNode.next==null){
                reverse=currNode;
            }
            currNode=currNode.next;
        }
        System.out.println("Reversing Dobly LL");
        while(reverse!=null){
            System.out.println(reverse.item);
            reverse=reverse.prev;
        }
    }

    public static CreateDoubleLL insert( CreateDoubleLL obj,int data){
        Node node=new Node(data);
        if(obj.head==null){
            obj.head=node;
        }
        else{
            Node last=obj.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=node;
            node.prev=last;
        }
        return obj;
    }
}
