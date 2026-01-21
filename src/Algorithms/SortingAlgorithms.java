package Algorithms;

public class SortingAlgorithms {
    public static void  printArray (int[] arr, String algoName) {
        System.out.printf("Sorted Array Using %s:\n", algoName);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


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
        printArray(arr, "Bubble Sort");
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
        printArray(arr, "Quick Sort");
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
        printArray(arr, "Insertion Sort");
    }

    public static void main(String[] args) {
        int[] arr = {12,43,52,12,63,774,2,45,6,24,90};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(arr);
        quickSort(arr);
        insertionSort(arr);
    }
}
