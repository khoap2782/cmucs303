/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Description: Write a method that takes an Array of integers and returns a new ArrayList
//containing only the even numbers from the original array.
//• Hint: Create an empty ArrayList. Traverse the original array, and if an element is even
//(element % 2 == 0), add it to the ArrayList.
//• Example:
//o Input: Array [1, 2, 3, 4, 5, 6, 7, 8]
//o Output: ArrayList containing [2, 4, 6, 8]
package LEC7_EXERCISE;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THIEN QUOC AN
 */
public class exercise5_Filter_Even_Numbers {
    public static ArrayList<Integer> getEvenNumbers(int[] arr) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        ArrayList<Integer> result = getEvenNumbers(numbers);
        
        System.out.println("Even numbers: " + result);

        sc.close();
    }
}
