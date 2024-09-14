package org.example.recursion;

public class ExpressionTargetSum {
    public static void main(String[] args) {
        int arr[]={1,1,1,1};
        int target=3;
        System.out.println(findExpression(arr,0,target));
    }

    private static int findExpression(int[] nums, int index, int target) {
        if (index == nums.length) {
            return target == 0 ? 1 : 0;
        }
        int left=findExpression(nums, index + 1, target - nums[index]) ;
        int right=findExpression(nums, index + 1, target + nums[index]);
        return left+right;

    }
}

