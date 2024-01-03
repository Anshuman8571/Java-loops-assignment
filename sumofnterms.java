package Assignment1;

import java.util.Scanner;

public class sumofnterms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("enter number: ");
        int a = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < a+1; i++) {
            sum = sum + i;
        }
        System.out.println(sum);


    }
}
