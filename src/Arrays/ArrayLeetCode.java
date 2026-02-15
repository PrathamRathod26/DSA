package Arrays;

import Nodes.ListNode;

import java.util.*;

public class ArrayLeetCode {

    public static int[] twoSum (int[] arr, int target){
        HashMap<Integer,Integer> hp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if(hp.containsKey(complement)){
                return new int[] {hp.get(complement) + 1, i + 1};
            }
            hp.put(arr[i], i);
        }

        return new int[] {0,0};
    }

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

    public static List<List<Integer>> fourSum(int[] arr, int target){
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(arr);

        int n = arr.length;

        for (int i = 0; i < n - 3; i++) {
            if(i>0 && arr[i] == arr[i-1]) {
                continue;
            }
            for (int j = i+1; j < n-2; j++) {
                if (j>i+1 && arr[j]==arr[j-1]) {
                    continue;
                }

                int p=j+1, q=n-1;
                while (p<q){
                    long sum = (long) arr[i] + arr[j] + arr[p] + arr[q];

                    if(sum == target){
                        l.add(Arrays.asList(arr[i], arr[j], arr[p], arr[q]));

                        while(p<q && arr[p]==arr[p+1]) p++;
                        while (p<q && arr[q]==arr[q-1]) q--;

                        p++;
                        q--;
                    } else if(sum<target){
                        p++;
                    } else {
                        q--;
                    }
                }
            }
        }
        return l;
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 1; i++) {
            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int curr = nums[i] + nums[left] + nums[right];
                if(Math.abs(curr-target)<Math.abs(closest-target)){
                    closest = curr;
                }
                if(curr<target){
                    left++;
                } else if (curr > target) {
                    right--;
                } else {
                    return curr;
                }
            }
        }

        return closest;
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[j]!=nums[i]){
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }

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

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+ nums2.length;
        int[] a = new int[length];
        int i = 0, j = 0, k = 0;
        while(i<nums1.length && j< nums2.length){
            if(nums1[i]<=nums2[j]){
                a[k++] = nums1[i++];
            } else {
                a[k++] = nums2[j++];
            }
        }

        while(i<nums1.length) a[k++] = nums1[i++];
        while(j< nums2.length) a[k++] = nums2[j++];

        if(length%2==1){
            return a[length/2];
        } else {
            return (double) (a[length / 2 - 1] + a[length / 2]) /2;
        }
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static int search(int[] nums, int target) {
        int index = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                index=i;
            }
        }
        return index;
    }

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

    public static boolean isValidSudoku(char[][] board) {
        int n = 9;
        @SuppressWarnings("unchecked")
        HashSet<Character>[] row = new HashSet[n];
        @SuppressWarnings("unchecked")
        HashSet<Character>[] col = new HashSet[n];
        @SuppressWarnings("unchecked")
        HashSet<Character>[] box = new HashSet[n];


        for (int i = 0; i < n; i++) {
            row[i] = new HashSet<Character>();
            col[i] = new HashSet<Character>();
            box[i] = new HashSet<Character>();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char cell = board[i][j];
                if(cell =='.'){
                    continue;
                }
                int boxIndex = 3 * (i/3) + (j/3);

                if(row[i].contains(cell)||col[i].contains(cell)||box[boxIndex].contains(cell)){
                    return false;
                }

                row[i].add(cell);
                col[i].add(cell);
                box[boxIndex].add(cell);
            }
        }
        return true;
    }

    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
        } else {
            int i = digits.length-1;
            while(digits[i]==9){
                digits[i] = 0;
                i--;
                if(i==-1){
                    int[] newDigits = new int[digits.length+1];
                    newDigits[0] = 1;
                    return newDigits;
                }
            }
            digits[i]++;
        }
        return digits;
    }

    public static int maxProfit(int[] prices){

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price-minPrice);
            }
        }
        return maxProfit;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void moveZeros(int[] arr){
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        if(j==-1) return;
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
    }

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

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

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

    public static void sortColors(int[] nums){
        HashMap<Integer,Integer> map = new HashMap();
        for(int i = 0; i<nums.length; i++){
            
        }
    }

}
