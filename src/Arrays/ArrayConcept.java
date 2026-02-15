package Arrays;

import Nodes.ListNode;

import java.util.Arrays;

import static Arrays.ArrayLeetCode.*;
import static LinkedList.LinkedListLeetCode.*;

public class ArrayConcept {
    public static void main(String[] args) {

//        int[] nums = {-10,-8,-2,1,2,5,6};
//        int[] l = twoSum(nums, 0);
//        System.out.println(Arrays.toString(l));

//        int[] nums = {-1,0,1,2,-1,4};
//        List<List<Integer>> l = threeSum(nums, 1);
//        System.out.println(l);

//        int[] nums = {2,0,1,-1,0,1};
//        int a = threeSumClosest(nums,2);
//        System.out.println(a);

//        int[] nums = {1,0,-1,0,-2,2};
//        List<List<Integer>> a = fourSum(nums,0);
//        System.out.println(a);

//        int [] nums = {1,1,2,2,2,3,4,4,5};
//        int a = removeDuplicates(nums);
//        System.out.println(a);

//        int[] nums = {3,2,2,3};
//        int target = 3;
//        int a = removeElement(nums,target);
//        System.out.println(a);

//        int[] nums = {1,8,6,2,5,4,8,3,7};
//        int a = maxArea(nums);
//        System.out.println(a);

//        int[] nums1 = {2,2,2,4,4};
//        int[] nums2 = {2,2,4,4};
//        double a = findMedianSortedArrays(nums1,nums2);
//        System.out.println(a);

//        String[] strs = {"flower","flow","flight"};
//        String prefix = longestCommonPrefix(strs);
//        System.out.println(prefix);

//        int[] nums = {4,5,6,7,0,1,3};
//        int a = search(nums,9);
//        System.out.println(a);

//        int[] nums = {5,7,7,8,8,10};
//        int[] range = searchRange(nums,8);
//        System.out.println(EasyArray.toString(range));

//        int[] nums = {1,3,5,6,7};
//        int a = searchInput(nums, 8);
//        System.out.println(a);

//        char[][] board = {
//                {'8','3','.','.','7','.','.','.','.'},
//                {'6','.','.','1','9','5','.','.','.'},
//                {'.','9','8','.','.','.','.','6','.'},
//                {'8','.','.','.','6','.','.','.','3'},
//                {'4','.','.','8','.','3','.','.','1'},
//                {'7','.','.','.','2','.','.','.','6'},
//                {'.','6','.','.','.','.','2','8','.'},
//                {'.','.','.','4','1','9','.','.','5'},
//                {'.','.','.','.','8','.','.','7','9'}
//        };
//        boolean valid = isValidSudoku(board);
//        System.out.println(valid);

//        int[] digits = {9,9,9,9,9,9};
//        int[] a = plusOne(digits);
//        System.out.println(Arrays.toString(a));

//        int[] prices = {7,6,4,3,1};
//        System.out.println(maxProfit(prices));

//        int[] arr = {0,1,3,0,0,5,6};
//        moveZeros(arr);
//        System.out.println(Arrays.toString(arr));

//        int[] arr = {1,12,-5,-6,50,3};
//        int [] arr = {4};
//        int[] arr = {0, 4, 0, 3, 2};
//        double avg = findMaxAverage(arr, 1);
//        System.out.println(avg);

//        int[] arr = {2, 4, 6, 2, 6};
//        ListNode l = createLLFromArray(arr);
//        ListNode res = middleNode(l);
//        System.out.println(res.val);

//        int[] arr = {-1,-3,0,5,7};
//        int[] res = sortedSquares(arr);
//        System.out.println(Arrays.toString(res));

        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
