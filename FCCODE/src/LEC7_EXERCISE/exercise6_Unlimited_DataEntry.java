/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Unlimited Data Entry (ArrayList)
//• Description: Write a program that allows the user to enter integers continuously and stores
//them in an ArrayList. The input process stops when the user enters -1. After stopping, print
//all the numbers entered and their sum.
//• Hint: This is a typical example showing the benefit of ArrayList over Array because the
//number of elements is not known in advance. Use a while loop to get the data.
//• Example:
//o Input: 10, 20, 5, -1
//o Output: Numbers entered: [10, 20, 5], The sum is: 35
package LEC7_EXERCISE;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author THIEN QUOC AN
 */
public class exercise6_Unlimited_DataEntry {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number to count: ");
        int x = sc.nextInt();
        
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }

        System.out.println(x + " appears " + count + " times.");
        sc.close();
    }
}
