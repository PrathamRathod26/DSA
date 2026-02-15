package Arrays.LeetCodeQuestions;

public class Search {

    public static int search(int[] nums, int target) {
        int index = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(nums, target);
        System.out.println("Index of " + target + ": " + result);
    }
}
