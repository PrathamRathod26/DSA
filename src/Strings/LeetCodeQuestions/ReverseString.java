package Strings.LeetCodeQuestions;

public class ReverseString {
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

    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'd', 'e'};
        reverseString(s);
        System.out.println(s);
    }
}
