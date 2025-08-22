package Lec3_Scanner;
import java.util.Scanner;
public class ScannerOneLineOfString {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sentence = keyboard.nextLine();
    }
    
}
