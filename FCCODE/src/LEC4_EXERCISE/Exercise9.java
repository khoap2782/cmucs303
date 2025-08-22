/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC4_EXERCISE;
import java.util.Scanner;
/**
 *
 * @author THIEN QUOC AN
 */
public class Exercise9 {
    public static void main(String args []){
            Scanner scanner = new Scanner(System.in); 
            System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int abs = (num >= 0) ? num : -num;
        System.out.println("The absolute value is " + abs);
        scanner.close();
}
}