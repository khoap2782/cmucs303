
package Lec3_Scanner;
import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String args []) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a multi-word sentence : ");
        String sentence = keyboard.nextLine();
        System.out.println(sentence);
        System.out.print("Enter a one word string; ");
        String s = keyboard.next();
        System.out.print(s);
    }
    
}
