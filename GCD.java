package Assignment1;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = scan.nextInt();
        System.out.println("enter second number: ");
        int b = scan.nextInt();

        for (int i = 1; i<b; i++) {
            if (a%i==0 && b%i==0) {
                System.out.println(i);
                
            } 
        }
        

    }
}
