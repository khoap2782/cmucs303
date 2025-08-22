/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Exercise 10: Draw an Isosceles Triangle with Asterisks (*)
//• Description: Ask the user to enter the height h of an isosceles triangle. Use nested loops to
//draw a hollow isosceles triangle using asterisks *.
//• Hint: This is a more advanced exercise that requires calculating the number of spaces and
//asterisks on each line. You will need an outer loop to iterate through the rows and two inner
//loops: one to print spaces and one to print asterisks.
//• Example:
//o Input: h = 3
//o Output:
//o *
//o * *
//o *****
package LEC5_EXERCISE;
import java.util.Scanner;
/**
 *
 * @author THIEN QUOC AN
 */
public class Exercise10DrawanIsoscelesTriangle {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       //hỏi 
       System.out.print("Enter the hight of an isosceles triangle: ");
       int h =  sc.nextInt();
       //vòng lập ngoài từng dòng 
       for (int i = 1; i <= h; i++){
           //in khoảng trắng bên trái
       for (int space = 1; space <= h - i; space++){
           System.out.print(" ");
       }
       //in dấu * hoặc khoảng trắng trong thân tam giác
       for (int j = 1; j<= 2 * i - 1; j++){
           if (i == 1 || i == h || j == 1 || j == 2 * i - 1){
               System.out.print("*");
           }else{
               System.out.print(" ");
           }
       }
       //xuống dòng 
       System.out.println();
   }
       sc.close();
    }
}
