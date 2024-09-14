package org.example.Tree;

import java.util.ArrayDeque;
import java.util.Deque;

class Node{
    int data;
    Node left,right;

    Node(int item){
        data=item;
        left=right=null;
    }
}
class Pair{
    Integer width;
    Node node;
    Pair(Integer width,Node node){
        this.width=width;
        this.node=node;
    }
}
public class Binarytree {
    Node root;
    void traverseTree(Node node){
        if(node!=null) {
//            System.out.println(node.data);
            traverseTree(node.left);
            traverseTree(node.right);
        }
    }

    int findLeftMostValue(Node root,int level,int currValue){

        if(root==null){
            return 0;
        }
        if(root.left!=null){
            currValue=root.left.data;
        }
        findLeftMostValue(root.left,level+1,currValue);
        findLeftMostValue(root.right,level,currValue);
        return currValue;


    }

    public static void main(String[] args) {
        Binarytree tree=new Binarytree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(3);
        tree.root.right=new Node(5);
//        tree.root.right.left=new Node(5);
        tree.root.right.right=new Node(6);
//        tree.root.right.left.left=new Node(7);
        tree.traverseTree(tree.root);
        int val=tree.findLeftMostValue(tree.root,0,0);
        int ans=findWidthofTree(tree.root);
        System.out.println(ans);
//        System.out.println(val);
    }

    private static int findWidthofTree(Node root) {
        Deque<Pair>q=new ArrayDeque<>();
        Pair p1=new Pair(0,root);
        q.add(p1);
        int ans=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            Pair temp=q.peek();
            int leftMostNodeNo=temp.width;
            int rightMostNodeNo=Integer.MIN_VALUE;
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair temp1=q.peek();
                q.removeFirst();
                Node node=temp1.node;
                int cuurentNodeNo=temp1.width;
                rightMostNodeNo=Math.max(rightMostNodeNo,temp1.width);
                if(node.left!=null){
                    Pair l=new Pair(2*cuurentNodeNo+1,node.left);
                    q.add(l);
                }
                if(node.right!=null){
                    Pair r=new Pair(2*cuurentNodeNo+2,node.right);
                    q.add(r);
                }
            }
            ans=Math.max(ans,rightMostNodeNo-leftMostNodeNo+1);

        }

        return ans;

    }

}
