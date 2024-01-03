package Assignment1;

import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a no.");
        int x = scan.nextInt();

        for(int i = 1; i<=10;i++){
            System.out.println(x*i);
        }
    }
}
