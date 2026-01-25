package Algorithms;

import java.util.Arrays;

public class SortingAlgorithms {


    public static void bubbleSort (int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void quickSort (int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort (int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }

    public static boolean isEven(int i){
        return i%2==0;
    }

    public static void mergeSort(int[] arr){
        int length = arr.length;

        if(length<= 1) {
            return;
        }

        int s1 = length/2;
        int s2 = length-s1;
        int[] a1 = new int[s1];
        int[] a2 = new int[s2];

        int i = 0 , j = 0;
        for (; i < length; i++) {
            if(i<(length/2)){
                a1[i] = arr[i];
            } else {
                a2[j] = arr[i];
                j++;
            }
        }

        mergeSort(a1);
        mergeSort(a2);
        merge(a1, a2, arr);
    }

    public static void merge(int[] a1, int[] a2, int[] arr) {
        System.out.println("merging: " + Arrays.toString(a1) + " and " + Arrays.toString(a2));
        int l = a1.length;
        int r = a2.length;

        int i = 0, li = 0, ri = 0;

        while (li < l && ri < r) {
            if (a1[li] < a2[ri]) {
                arr[i++] = a1[li++];
            } else {
                arr[i++] = a2[ri++];
            }
        }

        while (li < l) {
            arr[i++] = a1[li++];
        }

        while (ri < r) {
            arr[i++] = a2[ri++];
        }
    }


    public static void main(String[] args) {
        int[] arr = {12,43,52,12,63,774,2,45,6,24,90};
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array: "+ Arrays.toString(arr));

//        bubbleSort(arr);
//        quickSort(arr);
//        insertionSort(arr);
        mergeSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
