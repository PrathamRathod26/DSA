package Arrays.LeetCodeQuestions;

public class MaxArea {

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = -1;

        while(left<right){
            int width = right-left;
            int currArea = Math.min(height[left],height[right])*width;

            maxArea = Math.max(maxArea,currArea);

            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(height);
        System.out.println("Max area: " + result);
    }
}
