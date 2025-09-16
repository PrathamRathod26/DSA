package Concepts;

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

        if(arr[index]<arr[index+1]){
            return isSorted(arr, index+1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D"); // Time Complexity: O(2^n)

        String name = "pratham";
        printReverse(name, name.length()-1); // Time Complexity: O(n)

        String str = "aoghaoihgoagagah";
        findOccurance(str, 0,'h');

        int[] arr = {1,3,4,6,8,9,0};
        System.out.println(isSorted(arr,0));
    }
}
