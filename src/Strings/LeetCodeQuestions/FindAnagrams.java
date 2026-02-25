package Strings.LeetCodeQuestions;

import java.util.*;

public class FindAnagrams {
    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> res = new ArrayList<>();
        int n = s.length(), k = p.length();

        if(n<k) return new ArrayList<>();

        int[] reference = new int[26];
        int[] window = new int[26];

        for(char c : p.toCharArray()) reference[c - 'a']++;
        for(char c: s.substring(0,k).toCharArray()) window[c-'a']++;

        if(Arrays.equals(reference,window)) res.add(0);

        for (int i = 1; i < n - k + 1; i++) {
            window[s.charAt(i-1) - 'a']--;
            window[s.charAt(i+k-1) - 'a']++;
            if(Arrays.equals(reference,window)) res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "dbca";
        List<Integer> result = findAnagrams(s,p);
        System.out.println(result);
    }
}
