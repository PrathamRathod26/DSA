package StriverDSA.Easy;

import java.util.Arrays;

public class EasyArray {
    public static int findLargest(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void findSecond(int[] arr){
        if(arr.length<2){
            System.out.println("Second Small: " + -1);
            System.out.println("Second Large: " + -1);
            return;
        }

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;



        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>large){
                secondLarge = large;
                large = arr[i];
            } else if (arr[i]>secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }
            if(arr[i]<small){
                secondSmall = small;
                small = arr[i];
            } else if (arr[i]<secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }

        System.out.println("Second Small: " + secondSmall);
        System.out.println("Second Large: " + secondLarge);
    }

    public static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                return false;
            }
        }

        return true;
    }

    public static int[] removeDuplicate(int[] arr){
        int j=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[j-1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return arr;
    }

    public static void leftRotate(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void rightRotate(int[] arr){
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void RotateBy(int[] arr, int n, char d){
        switch (d){
            case 'r':
                for (int i = 0; i < n; i++) {
                    rightRotate(arr);
                }
                break;
            case 'l':
                for (int i = 0; i < n; i++) {
                    leftRotate(arr);
                }
                break;
            default:
                System.out.println("Invalid Direction. use 'l' or 'r'");
        }
    }

    public static void moveZeros(int[] arr){
        int j = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1) return;

        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static int linearSearch(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }


}
