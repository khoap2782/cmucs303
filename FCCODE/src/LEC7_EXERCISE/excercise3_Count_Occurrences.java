/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//: Count Occurrences (Array)
//• Description: Write a program that creates an array of integers. Then, ask the user to enter a
//number X and count how many times that number X appears in the array.
//• Hint: Use a for loop to traverse each element of the array. Use a counter variable and
//increment it every time an element equal to X is found.
//• Example:
//o Input: Array [2, 5, 6, 5, 2, 5], number to find X = 5
//o Output: The number 5 appears 3 times.
package LEC7_EXERCISE;
import java.util.Scanner;
/**
 *
 * @author THIEN QUOC AN
 */
public class excercise3_Count_Occurrences {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        
        System.out.println("Enter the element:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        reverse(numbers);
        
        System.out.println("Rersed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }
    }
}
