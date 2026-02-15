package Arrays.LeetCodeQuestions;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0, right = n-1;
        int[] result = new int[n];

        int index = n-1;

        while(left<=right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare>rightSquare){
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);
        System.out.print("Sorted squares: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
