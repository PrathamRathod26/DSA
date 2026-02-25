package Strings.LeetCodeQuestions;

import java.util.Arrays;

public class CheckInclusion {
    public static boolean checkInclusion(String s1, String s2){
        if(s1.length() > s2.length()) return false;

        int[] ref = new int[26];
        int[] window = new int[26];

        for(char c : s1.toCharArray()) ref[c - 'a']++;
        for(char c : s2.substring(0,s1.length()).toCharArray()) window[c - 'a']++;

        if(Arrays.equals(window,ref)) return true;

        for (int i = 1; i < s2.length() - s1.length() + 1; i++) {
            window[s2.charAt(i-1) - 'a']--;
            window[s2.charAt(i + s1.length() - 1) - 'a']++;
            if(Arrays.equals(ref,window)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "a";
        System.out.println(checkInclusion(s1,s2));
    }
}
