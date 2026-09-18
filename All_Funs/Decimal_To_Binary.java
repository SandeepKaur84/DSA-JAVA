public class Decimal_To_Binary {
    public static void Dec_To_Bin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int remainder = decNum % 2;
            binNum = binNum + (remainder * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary of " + myNum + " is : " + binNum);
    }

    public static void main(String[] args) {
        Dec_To_Bin(11);
    }
}
