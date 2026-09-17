package Arrays;

public class Largest {

    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {8,7,9,8,7,4,5,6,3,2,2,11,44,77,88,22,55,66,99,0,30};
        System.out.println(getLargest(arr));
    }
}
