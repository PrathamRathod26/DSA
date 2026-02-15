package Arrays.LeetCodeQuestions;

import java.util.*;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 1; i++) {
            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int curr = nums[i] + nums[left] + nums[right];
                if(Math.abs(curr-target)<Math.abs(closest-target)){
                    closest = curr;
                }
                if(curr<target){
                    left++;
                } else if (curr > target) {
                    right--;
                } else {
                    return curr;
                }
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = threeSumClosest(nums, target);
        System.out.println("Closest sum: " + result);
    }
}
