package Sorting;

import java.util.Arrays;

public class Bubble_Sort {

    public static void Bubble_Sorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            System.out.println("Pass " + (i + 1) +
                    " -> " + Arrays.toString(arr) +
                    " | Swaps: " + swaps);

            if (swaps == 0) {
                System.out.println("No swaps needed");
                break;
            }
        }
    }

    public static void BblSortPractice(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 8, 9, 6, 1 };
        System.out.println("Before: " + Arrays.toString(arr));
        // Bubble_Sorting(arr);
        BblSortPractice(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}