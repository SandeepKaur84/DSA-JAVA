package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort {
    public static void main(String[] args) {
        Integer arr[] = { 8, 7, 2, 0, 5, 6, 9, 3, 1, 0 };
        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

    }
}
