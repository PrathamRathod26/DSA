package Arrays.LeetCodeQuestions;

public class FindMedianSortedArrays {

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

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + result);
    }
}
