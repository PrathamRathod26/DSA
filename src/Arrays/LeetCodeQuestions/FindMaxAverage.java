package Arrays.LeetCodeQuestions;

public class FindMaxAverage {

    public static double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = findMaxAverage(nums, k);
        System.out.println("Max average: " + result);
    }
}
