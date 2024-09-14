package org.example.recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

class TugOfWar {
    static int minDiff;
    public static void main(String[] args) {
        int nums[]={23, 45, -34, 12, 0, 98,
                -99, 4, 189, -1, 4};;
         tugOfWar(nums);
    }

    private static void tugOfWar(int[] nums) {
        int n=nums.length;
        boolean []curr_elements=new boolean[n];
        boolean []soln=new boolean[n];
        minDiff=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            curr_elements[i]=soln[i]=false;
        }
        tugUtil(nums,n,curr_elements,soln,0,sum,0,0);
        System.out.print("The first subset is: ");
        for (int i = 0; i < n; i++)
        {
            if (soln[i] == true)
                System.out.print(nums[i] + " ");
        }
        System.out.print("\nThe second subset is: ");
        for (int i = 0; i < n; i++)
        {
            if (soln[i] == false)
                System.out.print(nums[i] + " ");
        }

    }

    private static void tugUtil(int[] nums, int n, boolean[] curr_elements, boolean[] soln, int no_ofSelectedElements, int sum, int curr_sum, int curr_position) {
        if(curr_position==n){
            return;
        }
        if((n/2)-no_ofSelectedElements>n-curr_position){
            return;
        }
        tugUtil(nums,n,curr_elements,soln,no_ofSelectedElements,sum,curr_sum,curr_position+1);
        no_ofSelectedElements++;
        curr_sum+=curr_sum+nums[curr_position];
        curr_elements[curr_position]=true;
        if(no_ofSelectedElements==n/2){
            if(Math.abs(sum/2-curr_sum)<minDiff){
                minDiff=Math.abs(sum/2-curr_sum);
            }
            for (int i=0;i<n;i++){
                soln[i]=curr_elements[i];
            }
        }else{
            tugUtil(nums,n,curr_elements,soln,no_ofSelectedElements,sum,curr_sum,curr_position);
        }
        curr_elements[curr_position]=true;

    }

}
