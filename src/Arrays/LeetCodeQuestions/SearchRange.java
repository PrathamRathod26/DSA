package Arrays.LeetCodeQuestions;

public class SearchRange {

    public static int[] searchRange(int[] nums, int target) {
        int[] range = {-1,-1};

        int start = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid]==target)
            {
                start = mid;
                high = mid - 1;

            }
            else if(nums[mid]>target)
            {
                high = mid - 1;

            }
            else
            {
                low = mid + 1;
            }
        }

        int end = -1;
        low = 0;
        high = nums.length - 1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid]==target)
            {
                end = mid;
                low = mid + 1;
            }
            else if(nums[mid]>target)
            {
                high = mid - 1;

            }
            else
            {
                low = mid + 1;
            }
        }

        range[0] = start;
        range[1] = end;

        return range;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("Range: [" + result[0] + ", " + result[1] + "]");
    }
}
