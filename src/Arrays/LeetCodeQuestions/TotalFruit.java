package Arrays.LeetCodeQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class TotalFruit {
    public static int totalFruit(int[] fruits){
        if(fruits.length<3){
            return fruits.length;
        }

        int maxLength = 0;
        int l = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int r = 0; r<fruits.length; r++){
            map.put(fruits[r],r);
            if(map.size()>2) {
                l = map.remove(fruits[l]) + 1;
            }
            maxLength = Math.max(maxLength, r-l+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        int[] fruits1 = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println("Test 1: " + totalFruit(fruits1) + " | Expected: 5");

        int[] fruits2 = {0,1,6,6,4,4,6};
        System.out.println("Test 2: " + totalFruit(fruits2) + " | Expected: 5");

        int[] fruits3 = {1,2,3,2,2};
        System.out.println("Test 3: " + totalFruit(fruits3) + " | Expected: 4");

        int[] fruits4 = {1,2,1,2,3};
        System.out.println("Test 4: " + totalFruit(fruits4) + " | Expected: 4");

        int[] fruits5 = {0,1,2,2};
        System.out.println("Test 5: " + totalFruit(fruits5) + " | Expected: 3");

        int[] fruits6 = {1};
        System.out.println("Test 6: " + totalFruit(fruits6) + " | Expected: 1");

        int[] fruits7 = {1,2};
        System.out.println("Test 7: " + totalFruit(fruits7) + " | Expected: 2");

        int[] fruits8 = {1,1,1,1};
        System.out.println("Test 8: " + totalFruit(fruits8) + " | Expected: 4");

        int[] fruits9 = {1,2,3,4,5};
        System.out.println("Test 9: " + totalFruit(fruits9) + " | Expected: 2");

        int[] fruits10 = {1,2,1,3,4,3,5,1,2};
        System.out.println("Test 10: " + totalFruit(fruits10) + " | Expected: 3");

        int[] fruits11 = {2,2,2,1,1,2,2,2,1,1,2,2};
        System.out.println("Test 11: " + totalFruit(fruits11) + " | Expected: 12");

        int[] fruits12 = {1,2,1,3,1,2,1,2,1};
        System.out.println("Test 12: " + totalFruit(fruits12) + " | Expected: 5");

        int[] fruits13 = {5,5,1,2,1,2,1,2,1,2};
        System.out.println("Test 13: " + totalFruit(fruits13) + " | Expected: 8");
    }
}
