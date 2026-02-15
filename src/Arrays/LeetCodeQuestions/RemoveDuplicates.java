package Arrays.LeetCodeQuestions;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[j]!=nums[i]){
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(nums);
        System.out.print("New length: " + length + ", Array: [");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + (i < length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
