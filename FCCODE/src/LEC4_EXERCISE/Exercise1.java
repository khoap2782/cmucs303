
package LEC4_EXERCISE;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String args []){
            Scanner scanner = new Scanner(System.in); 
             System.out.print("Enter the integer: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
        scanner.close();
    }
}
