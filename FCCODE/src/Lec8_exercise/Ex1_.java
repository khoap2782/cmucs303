/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lec8_exercise;

import java.util.Scanner;

/**
 *
 * @author THIEN QUOC AN
 */
public class Ex1_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
    
