public class Binary_To_Decimal {
    public static void Bin_To_Dec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myNum + " is : " + decNum);
    }

    public static void practice(int binNum) {
        int pow = 0;
        int decNUm = 0;
        int muNum = binNum;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNUm = decNUm + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + muNum + " is : " + decNUm);
    }

    public static void main(String[] args) {
        Bin_To_Dec(101);
        practice(101);
    }
}
