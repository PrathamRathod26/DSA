package Arrays.LeetCodeQuestions;

import java.util.*;

public class SortColors {

    public static void sortColors(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){

        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.print("Sorted colors: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + (i < nums.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println("Note: This method is incomplete in the original file.");
    }
}
