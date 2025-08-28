/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Reverse an Array (Array)
//• Description: Write a method that takes an array of integers and reverses the order of its
//elements in place (without creating a new array).
//• Hint: Use a for loop that runs up to half the length of the array (numbers.length / 2). In each
//iteration, swap the element at index
//i with the element at index length - 1 - i.
//• Example:
//o Input: [11, 42, -5, 27, 0, 89]
//o Output (array after reversal): [89, 0, 27, -5, 42, 11]
package LEC7_EXERCISE;

import java.util.Scanner;

/**
 *
 * @author THIEN QUOC AN
 */
public class excecise2_Reverse_an_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
