package Strings;

public class Comparison {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str.equals(str3));
    }
}
