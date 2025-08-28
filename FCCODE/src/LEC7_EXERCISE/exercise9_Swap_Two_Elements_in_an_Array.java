/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Description: Write a method named swap that takes an array of integers and two indices
//(index1, index2), then swaps the values of the two elements at those indices.
//• Hint: Because arrays are passed by reference, any changes made inside the method will
//affect the original array.
//• Example:
//o Original array: [10, 20, 30]
//o Call swap(array, 0, 2)
//o Array after the function call: [30, 20, 10]

package LEC7_EXERCISE;

import java.util.Scanner;

/**
 *
 * @author THIEN QUOC AN
 */
public class exercise9_Swap_Two_Elements_in_an_Array {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter two indices to swap:");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        swap(numbers, index1, index2);

        System.out.println("Array after swap:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
