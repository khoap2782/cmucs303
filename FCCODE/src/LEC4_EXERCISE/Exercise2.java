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
public class Exercise2 {
    public static void main(String args []){
            Scanner scanner = new Scanner(System.in); 
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            if (age >0 && age <= 12){
                System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adult");
        } else if (age >= 60) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid age");
        }
        scanner.close();  
            }
}
