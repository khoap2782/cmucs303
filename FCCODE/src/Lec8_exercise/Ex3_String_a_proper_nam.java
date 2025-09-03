 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//String Compression
//• Description: Write a program to compress a string by replacing consecutive repeating
//characters with the character followed by the count of repetitions.
//• Hint: Iterate through the string, using a counter to track the repetition count of the current
//character. When the character changes, append the previous character and its count to a
//StringBuilder.
//• Example:
//o Input: "AAABBCDDDD"
//o Output: "A3B2C1D4"

package Lec8_exercise;

import java.util.Scanner;

/**
 *
 * @author THIEN QUOC AN
 */
public class Ex3_String_a_proper_nam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        if(input.isEmpty()){
            System.out.println("Compressed string: ");
            return;
            }
        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;
        for (int i = 1; i < input.length(); i++){
            if (input.charAt(i) == currentChar){
                count++;
            }else{
                compressed.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        compressed.append(currentChar).append(count);
        System.out.println("Compressed string:" +compressed.toString());
        }
    }

