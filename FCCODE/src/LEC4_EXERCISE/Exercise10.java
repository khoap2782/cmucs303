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
public class Exercise10 {
    public static void main(String args []){
            Scanner scanner = new Scanner(System.in); 
             System.out.print("Enter side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("This is an equilateral triangle.");
            } else if (a == b || a == c || b == c) {
                System.out.println("This is an isosceles triangle.");
            } else {
                System.out.println("This is a scalene triangle.");
            }
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
        scanner.close();
}
}
