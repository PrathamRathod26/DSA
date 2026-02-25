package Arrays.LeetCodeQuestions;

import static Arrays.HelperFunctions.swap;

public class MoveZeros {
    public static void moveZeros(int[] arr){
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        if(j==-1) return;
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
        System.out.print("Array after moving zeros: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
