import java.util.Scanner;

public class First {

    public static int sum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(sum());
    }
}