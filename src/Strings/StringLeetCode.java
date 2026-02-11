package Strings;

import java.util.*;

public class StringLeetCode {
    public static void print(String s){
        System.out.println(s);
    }

    public static int romanToInt(String s){
        int res = 0;

        for(int i = 0; i<s.length()-1;i++){
            if(romanValue(s.charAt(i))<romanValue(s.charAt(i+1))){
                res -= romanValue(s.charAt(i));
            } else {
                res += romanValue(s.charAt(i));
            }
        }
        return res + romanValue(s.charAt(s.length()-1));
    }

    public static int romanValue(Character ch){
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static String removeOuterParentheses(String s) {
        int level = 0;
        StringBuilder ans = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch=='('){
                if(level>0){
                    ans.append(ch);
                }
                level++;
            } else {
                level--;
                if(level>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }

    public static void reverseString(char[] s){
        int low = 0;
        int high = s.length-1;

        while(low<high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
    }

    public static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
         s = s.toLowerCase();

        while(l<r){
            while(!Character.isLetterOrDigit(s.charAt(l)) && l<r ){
                l++;
            }
            while (!Character.isLetterOrDigit(s.charAt(r)) && l<r ){
                r--;
            }
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;

        }
        return true;
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == s.length();
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;

        for(int i = 0; i<s.length()-3; i++){
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);
            if(a != b && b != c && a != c){
                count++;
            }
        }
        return count;
    }

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


}
