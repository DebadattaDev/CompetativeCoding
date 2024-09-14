package org.example.recursion.backtracking;

public class WordSearch {
    public static void main(String[] args) {
        String s="ABCCED";
        char board[][]={
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==s.charAt(0)){
                    System.out.println(findWord(board,s,"",board.length,board[0].length,i,j,0));
                }
            }
        }

    }

    private static boolean findWord(char[][] board, String s, String p,int m,int n,int row, int col,int idx) {
        if(idx==s.length()){
            return true;
        }
        if(row<0 || row>=m || col>= n || col<0 || board[row][col]!=s.charAt(idx)){
            return false;
        }
        board[row][col]='#';
        //To move left right top bottom
        int r[]={0,0,-1,1};
        int c[]={-1,1,0,0};
        for(int i=0;i<c.length;i++){
            boolean ans=findWord(board,s,p,m,n,row+r[i],col+c[i],idx+1);
            if(ans) return true;
        }
        board[row][col]=s.charAt(idx);

        return false;

    }


}
