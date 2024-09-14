package org.example.recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countPath(3,3));
        showPath("",3,3);
        System.out.println(showPathInArray("",3,3).toString());
        diagonalMaze("",3,3);
//        boolean maze[][]={
//                {true,false,false,false},
//                {true,true,false,true},
//                {false,true,false,false},
//                {true,true,true,true}
//        };
        boolean maze[][]={
                {true,true,true,true},
                {true,true,true,true},
                {true,true,true,true}
        };
        int[][] path=new int[maze.length][maze[0].length];
        mazeWithObstracle("",maze,maze.length-1,maze[0].length-1);
        allPath("",maze,0,0);
        printAllPath("",maze,0,0,path,0);
    }

    private static void mazeWithObstracle(String s, boolean maze[][], int r, int c) {
        if(r==2 && c==2){
            System.out.println(s);
            return ;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<2){
            showPath(s+"D",r+1,c);
        }
        if(c<2){
            showPath(s+"R",r,c+1);
        }

    }

    private static void diagonalMaze(String s, int r, int c) {
        if(r==1 && c==1){
            System.out.println(s);
            return ;
        }
        if(r>1){
            showPath(s+"V",r-1,c);
        }
        if(c>1){
            showPath(s+"H",r,c-1);
        }
        if(c>1 && r>1){
            showPath(s+"D",r,c-1);
        }

    }

    private static ArrayList<String> showPathInArray(String s, int r, int c) {
        if(r==1 && c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        if(r>1){
            list.addAll(showPathInArray(s+"D",r-1,c));
        }
        if(c>1){
            list.addAll(showPathInArray(s+"R",r,c-1));
        }
        return list;

    }

    private static void showPath(String p,int r, int c) {
        if(r==1 && c==1){
            return ;
        }
        if(r>1){
            showPath(p+"D",r-1,c);
        }
        if(c>1){
            showPath(p+"R",r,c-1);
        }
    }

    private static int countPath(int r, int c) {
        if(r==1 || c==1){
            return 1;
        }
        int right=countPath(r-1,c);
        int left=countPath(r,c-1);
        return right+left;
    }

    private static void allPath(String s,boolean maze[][], int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(s);
            return ;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            allPath(s+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPath(s+"R",maze,r,c+1);
        }
        if(r>0){
            allPath(s+"U",maze,r-1,c);
        }

        if(c>0){
            allPath(s+"L",maze,r,c-1);
        }
        maze[r][c]=true;

    }
    private static void printAllPath(String s,boolean maze[][], int r, int c,int [][] path,int step) {
        if(r==maze.length-1 && c==maze[0].length-1){
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(s);
            System.out.println();
            return ;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            printAllPath(s+"D",maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            printAllPath(s+"R",maze,r,c+1,path,step+1);
        }
        if(r>0){
            printAllPath(s+"U",maze,r-1,c,path,step+1);
        }

        if(c>0){
            printAllPath(s+"L",maze,r,c-1,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }

}
