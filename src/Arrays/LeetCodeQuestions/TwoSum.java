package Arrays.LeetCodeQuestions;

import java.util.*;

public class TwoSum {

    public static int[] twoSum (int[] arr, int target){
        HashMap<Integer,Integer> hp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if(hp.containsKey(complement)){
                return new int[] {hp.get(complement) + 1, i + 1};
            }
            hp.put(arr[i], i);
        }

        return new int[] {0,0};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
