package Arrays.LeetCodeQuestions;

public class SearchInput {

    public static int searchInput(int[] nums, int target){
        int l=0, r=nums.length;
        while(l<r) {
            int m = l + (r - l) / 2;
            if(nums[m]<target){
                l = m+1;

            } else {
                r=m;

            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = searchInput(nums, target);
        System.out.println("Insert position for " + target + ": " + result);
    }
}
