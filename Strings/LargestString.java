package Strings;

public class LargestString {
    public static String printLargestString(String arr[]) {
        String largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest.compareToIgnoreCase(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static String practice(String arr[]) {
        String largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest.compareToIgnoreCase(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };
        // System.out.println(printLargestString(fruits));
        System.out.println(practice(fruits));
    }
}
