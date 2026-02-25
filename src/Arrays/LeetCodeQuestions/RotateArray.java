package Arrays.LeetCodeQuestions;

import java.util.Arrays;

import static Arrays.HelperFunctions.swap;

public class RotateArray {
    public static void reverse (int[] nums, int start, int end){
        while(start<end){
            swap(nums,start++,end--);
        }
    }
    public static void rotate(int[] nums, int k){
        int n = nums.length;

        if(n==0) return;
        k = k%n;

        reverse(nums,n-k,n-1);
        reverse(nums,0,n-k-1);
        reverse(nums,0, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        rotate(arr,4);
        System.out.println(Arrays.toString(arr));
    }
}
