package Strings.LeetCodeQuestions;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxLength = 0;

        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(l,map.get(s.charAt(r))+1);
            }

            int length = r-l+1;
            maxLength = Math.max(maxLength,length);
            map.put(s.charAt(r),r);
            r++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "ablacheaacah";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
