package Arrays;

public class Linear_Search {

    public static void linearSearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                System.out.println("Number found at index : " + i);
            }
        }
    }

    public static int LS(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 5, 6, 7, 8, 9, 10, 11, 25 };
        int key = 54;
        linearSearch(nums, key);
        int index = LS(nums, key);
        if (index == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index : " + index);
        }

    }
}
