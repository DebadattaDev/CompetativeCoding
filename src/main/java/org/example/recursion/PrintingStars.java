package org.example.recursion;

public class PrintingStars {
    public static void main(String[] args) {
        printStar(4,1);
    }

    private static void printStar(int no, int index) {
        if(no==0){
            return;
        }
        if(index<=no && index>=0){
            System.out.print('*');
            System.out.print(' ');
            printStar(no,++index);
        }else{
            System.out.println(' ');
            printStar(--no,1);
        }

    }
}
