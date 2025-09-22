package Concepts;

import java.util.HashSet;

public class Recursion {
    public static void towerOfHanoi(int n, String source, String helper, String destination){
        if (n==1) {
            System.out.println("Transfer disk" + n + " from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("Transfer disk" + n + " from " + source + " to " + destination);
        towerOfHanoi(n-1, helper, source, destination);
        return;
    }

    public static void printReverse(String str, int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        printReverse(str, index-1);
    }

    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int index, char element){
        if (index == str.length()){
            System.out.println("First Occurance of " + element + " is "+first);
            System.out.println("Last Occurance of " + element + " is "+last);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == element){
            if(first==-1){
                first = index;
            } else {
                last = index;
            }
        }
        findOccurance(str, index+1, element);
    }

    public static boolean isSorted(int[] arr, int index) {
        if(index == arr.length-1){
            return true;
        }

        if(arr[index] < arr[index+1]){
            return isSorted(arr, index+1);
        } else {
            return false;
        }
    }

    public static void moveAllX(String str, int index, int count, String newString){
        if (index == str.length()){
            for (int i = 0; i<count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(index);
        if (currentChar == 'x'){
            count++;
            moveAllX(str, index+1, count, newString);
        } else {
            newString += currentChar;
            moveAllX(str, index+1, count, newString);
        }
    }


    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if (map[currentChar - 'a']) {
            removeDuplicate(str, index+1, newString);
        } else {
            newString += currentChar;
            map[currentChar-'a'] = true;
            removeDuplicate(str, index+1, newString);
        }
    }

    public static void subsequences(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(index);

        subsequences(str, index+1, newString+currentChar);

        subsequences(str, index+1, newString);
    }

    public static void uniqueSubsequences(String str, int index, String newString, HashSet<String> set){
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currentChar = str.charAt(index);

        uniqueSubsequences(str, index+1, newString+currentChar, set);

        uniqueSubsequences(str, index+1, newString, set);
    }

    public static String[] keypad = {",", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombinations(String str, int index, String combination){
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(index);
        String mapping = keypad[currentChar-'0'];

        for (int i = 0; i<mapping.length(); i++){
            printCombinations(str, index+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        int n = 3;
//        towerOfHanoi(n, "S", "H", "D"); // Time Complexity: O(2^n)

        String str = "pratham";
//        printReverse(str, str.length()-1); // Time Complexity: O(n)

        str = "aoghaoihgoagagah";
//      findOccurance(str, 0,'h');
        int[] arr = {1,3,4,6,8,9,0};
//        System.out.println(isSorted(arr,0));

        str = "axbcxxdexfxgxxxhxi";
//        moveAllX(str, 0, 0, ""); // Time Complexity: O(n)

        str = "aabbcddefg";
//        removeDuplicate(str, 0, "");

        str = "abc";
//        subsequences(str, 0,""); // Time Complexity: O(2^n)

        str = "aaabc";
        HashSet <String> set = new HashSet<>();
//        uniqueSubsequences(str, 0,"", set);

        str = "236";
        printCombinations(str, 0, "");
    }
}
