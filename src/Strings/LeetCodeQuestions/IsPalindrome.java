package Strings.LeetCodeQuestions;

public class IsPalindrome {
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

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
