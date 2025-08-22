/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Exercise 12: Prime Number Check 
//• Description: Ask the user to enter a positive integer N greater than 1. Write a program to check if N is a prime number.
//• Hint: A prime number is a number that is only divisible by 1 and itself. Use a for loop that
//runs from 2 up to the square root of N (Math.sqrt(N)). If N is divisible by any number in this
//range, it is not a prime number. If the loop finishes without finding any divisors, then N is a
//prime number.
//• Example:
//o Input: 29
//o Output: 29 is a prime number.
//o Input: 15
//o Output: 15 is not a prime number
package LEC5_EXERCISE;
import java.util.Scanner;
/**
 *
 * @author THIEN QUOC AN
 */
public class Exercise12_Prime_Number_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer greater than 1: ");
        int N = sc.nextInt();
        boolean isPrime = true;
        if (N <= 1) {
            System.out.println("Number must be greater than 1.");
        } else {
            // kiểm tra từ 2 tới N-1
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N + " is a prime number.");
            } else {
                System.out.println(N + " is not a prime number.");
            }
        }
        sc.close();
}
}

