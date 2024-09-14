package org.example.recursion.backtracking;

public class NQueen {
    public static void main(String[] args) {
        int n=4;
        boolean board[][]=new boolean[n][5];
        queen(board,0);
    }

    private static int queen(boolean[][] board, int row) {
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col< board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=queen(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check for vertical
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        //check for diagonal left
        int maxleft=Math.min(row,col);
        for(int i=0;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //check for diagonal right
        int maxRight=Math.min(row,board[0].length-col-1);
        for(int i=0;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }


    public static void display(boolean[][] board) {
        for(boolean row[] :board){
            for(boolean element:row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
