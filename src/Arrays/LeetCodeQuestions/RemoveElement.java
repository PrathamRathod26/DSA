package Arrays.LeetCodeQuestions;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 5};
        int val = 3;
        int length = removeElement(nums, val);
        System.out.print("New length: " + length + ", Array: [");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + (i < length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
