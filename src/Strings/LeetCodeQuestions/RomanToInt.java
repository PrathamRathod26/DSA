package Strings.LeetCodeQuestions;

public class RomanToInt {

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

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
