package Arrays.LeetCodeQuestions;

import java.util.*;

public class FourSum {

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

    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = fourSum(arr, target);
        System.out.println("Quadruplets: " + result);
    }
}
