package Arrays;

import java.util.ArrayList;
import java.util.List;

import static Arrays.ArrayLeetCode.*;

public class ArrayConcept {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,4};
        List<List<Integer>> l = threeSum(nums);

        System.out.println(l);
    }


}
