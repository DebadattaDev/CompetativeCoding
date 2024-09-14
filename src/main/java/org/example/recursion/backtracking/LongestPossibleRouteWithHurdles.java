package org.example.recursion.backtracking;

public class LongestPossibleRouteWithHurdles {
    public static void main(String[] args) {
//        int mat[][] = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
//                { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
//                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
        int mat[][]={{1,1,1},{1,1,0},{1,1,0}};
        int row=mat.length;
        int col=mat[0].length;
        int direction[]={0,1,0,-1,0};
        int res=longestPath(mat,row,col,0,0,direction);
        System.out.println(res);
    }

    private static int longestPath(int[][] mat, int row, int col, int m, int n,int []direction) {
        if(m<0 || n<0 || m==row || n==col || mat[m][n]==0 ) return 0;
        int initialVal=mat[m][n];
        int maxval=0;
        mat[m][n]=0;
        for(int i=0;i<4;i++){
            maxval=Math.max(maxval,longestPath(mat,row,col,direction[i]+m,direction[i+1]+n,direction));
        }
        mat[m][n]=initialVal;
        return maxval+initialVal;

    }
}
