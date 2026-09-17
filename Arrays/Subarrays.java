package Arrays;

public class Subarrays {
    public static void main(String[] args) {
        int total_subarrays = 0;
        int arr[] = { 2, 4, 6, 8, 10 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                total_subarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays : " + total_subarrays);
    }
}
