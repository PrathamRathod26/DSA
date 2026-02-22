package Strings.LeetCodeQuestions;

import java.util.Arrays;

public class CharacterReplacement {
    public static int characterReplacement(String s, int k){
        int maxLength = 0;
        int maxFreq = 0;
        int l = 0;
        int[] freq = new int[26];
        for(int r = 0; r<s.length(); r++){
            int index = s.charAt(r) - 'A';
            freq[index]++;
            maxFreq = Math.max(maxFreq,freq[index]);
            while((r-l+1)-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLength = Math.max(maxLength,r-l+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABAABAA";
        System.out.println("Length: " + characterReplacement(s,1));
    }
}
