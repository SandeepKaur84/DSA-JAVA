package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        String str = "Sandeep Kaur";
        System.out.println(str);

        // input + output
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Helloooo " + name);
        sc.close();

        // length + concatenation
        System.out.println("Length of your name is : " + name.length());

        // charAt
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
    }
}
