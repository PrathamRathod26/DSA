package Arrays.LeetCodeQuestions;

public class MinSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums){
        int length = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;
        for(int r = 0; r< nums.length;r++){
            sum += nums[r];
            while(sum>=target){
                length = Math.min(length,r-l+1);
                sum -= nums[l];
                l++;
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }

    public static void main(String[] args) {
//        int[] arr = {2,3,1,2,4,3};
        int[] arr = {1,4,4};
        System.out.println("Length: " + minSubArrayLen(6,arr));
    }
}
