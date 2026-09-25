package DSA;

public class RemoveDuplicates {
    public static int removeDup(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] < arr[j]) {
                int temp = arr[j];
                arr[j] = arr[i + 1];
                arr[i + 1] = temp;
                i++;

            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 2, 2, 3};
        System.out.println(removeDup(arr));
    }
}
