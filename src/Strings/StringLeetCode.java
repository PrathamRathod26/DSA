package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

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

//    public static int lengthOfLongestSubstring(String s){
//        int max = 0;
//        int left = 0, right = 0;
//        HashMap<Character, Integer> hp = new HashMap<>();
//
//        while(right<s.length()){
//            if(!hp.containsKey(s.charAt(right)) && hp.get(s.charAt(right)) <= left){
//                hp.put(s.charAt(left), left);
//                right++;
//            } else {
//                int lastIndex = hp.get(s.charAt(left));
//                left = Math.max(left, lastIndex + 1);
//            }
//        }
//        System.out.println(hp);
//        return max;
//    }

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


}
