/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Exercise 1: Find the Maximum and Minimum Value (Array)
//• Description: Write a program that allows the user to enter a list of integers and store them in
//an Array. Then, find and print the element with the maximum and minimum value in that
//array.
//• Hint: Traverse the array using a for loop. Initialize two variables, max and min, with the
//value of the first element, then compare and update them during the traversal.
//• Example:
//o Input: Array [12, 49, -2, 26, 5]
//o Output: The maximum value is: 49, The minimum value is: -2
package LEC7_EXERCISE;
import java.util.Scanner;
/**
 *
 * @author THIEN QUOC AN
 */
public class exercise1Find_max_min_value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; // luu tru 
        
        System.out.print("Enter " + n + " integers:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The maximun value is " + max);
        System.out.println("The minimum value is " + min);
    }
    
}
