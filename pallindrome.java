package Assignment1;
import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int x = scan.nextInt();
        int n = 0;
        int x2 = x;            
        for (int i = 1; i >0; i++) {
            int y = x % 10;
            n = n * 10 + y;
            x = x / 10;
            if(x2 == n ){ 
            System.out.println("pallindrome");
            break;    
                }
            }
            if (x2!=n) {
                System.out.println("np");
                
            }
        
    }
}
