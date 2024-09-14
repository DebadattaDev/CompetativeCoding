package org.example.Tree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {
    Node root;

    private static void printlevelOrder(LevelOrderTraversal tree) {
        List<List<Integer>>ls=new ArrayList<>();
        int height=height(tree.root);
        for(int i=0;i<height;i++){
            List<Integer>ans=printEachLevel(tree.root,i,new ArrayList<>());
            ls.add(new ArrayList<>(ans));
        }
            System.out.println(ls.toString());
    }

    private static List<Integer> printEachLevel(Node root,int i,List<Integer>levelList) {
        if(root==null){
            return new ArrayList<>();
        }
        if(i==0){
            levelList.add(root.data);
        }else if(i>0){
            printEachLevel(root.left,i-1,levelList);
            printEachLevel(root.right,i-1,levelList);
        }
        return levelList;
    }

    private static int height(Node root) {
        if(root==null){
            return 0;
        }
        int lHeight=height(root.left);
        int rHeight=height(root.right);
        if(lHeight>rHeight){
            return 1+lHeight;
        }else{
            return 1+rHeight;
        }

    }

    public static void main(String[] args) {
        LevelOrderTraversal tree=new LevelOrderTraversal();
        tree.root=new Node(1);
        tree.root.left=new Node(10);
        tree.root.right=new Node(4);
        tree.root.left.left=new Node(3);
        tree.root.left.left.left=new Node(12);
        tree.root.left.left.right=new Node(8);
        tree.root.right.left=new Node(7);
        tree.root.right.right=new Node(9);
        tree.root.right.left.left=new Node(6);
        tree.root.right.right.right=new Node(2);
        printlevelOrder(tree);



    }



}
