/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Description: Write a program that asks the user to enter 5 integers into an array.
//1. Use Arrays.sort() to sort the array in ascending order and print the sorted array.
//2. Ask the user for a number to find and report its index in the sorted array.
//• Hint: After sorting, you can use a simple loop to find the index of the element.
//• Example:
//o Input: [40, 20, 50, 10, 30]
//o Output after sorting: [10, 20, 30, 40, 50]
//o Number to find: 30 -> Output: The number 30 was found at index 2.
package LEC7_EXERCISE;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author THIEN QUOC AN
 */
public class exercise8_Sort_and_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        System.out.print("Enter a number to find: ");
        int target = sc.nextInt();

        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The number " + target + " was found at index " + index);
        } else {
            System.out.println("The number " + target + " was not found in the array.");
        }

        sc.close();
    }
}
    
