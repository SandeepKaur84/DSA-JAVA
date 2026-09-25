package Bit_Manipulation;

public class Check_Power {

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(15));
        System.out.println(isPowerOfTwo(25));
        System.out.println(isPowerOfTwo(32));
    }
}
