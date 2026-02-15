package Arrays.LeetCodeQuestions;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] arr, int target){
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length -2; i++) {
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }

            int left = i + 1;
            int right = arr.length-1;

            while(left<right){
                int sum = arr[i] + arr[left] + arr[right];

                if(sum==target){
                    l.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    while(left<right && arr[left]==arr[left+1]) left++;
                    while(left<right && arr[right]==arr[right-1]) right--;

                    left++;
                    right++;
                } else if(sum < 0){
                    left++;
                } else {
                    right --;
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        List<List<Integer>> result = threeSum(arr, target);
        System.out.println("Triplets: " + result);
    }
}
