package Assignment1;
import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int x = scan.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < x; i++) {
            System.out.println(b);
            int sum = a + b;
            a = b ;
            b = sum;

        }
    }
}
