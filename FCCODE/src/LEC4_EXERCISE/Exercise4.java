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
public class Exercise4 {
    public static void main(String args []){
            Scanner scanner = new Scanner(System.in); 
             System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                } else {
                    System.out.println(a + " / " + b + " = " + ((double) a / b));
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
        scanner.close();
}
}