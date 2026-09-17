package Arrays;

public class Max_Subarrays_Sum {
    public static void brute_Force(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    if (sum > max_sum) {
                        max_sum = sum;
                    }
                }
            }
        }
        System.out.println(max_sum);
    }

    public static void kadanes_Algo(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        System.out.println("Maximum sum is : " + max_sum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        brute_Force(arr);
        kadanes_Algo(arr);
    }
}
