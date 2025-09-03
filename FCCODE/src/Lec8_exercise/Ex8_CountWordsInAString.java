/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//. Count Words in a String
//• Description: Write a program to accurately count the number of words in a string, ignoring
//any extra leading, trailing, or in-between spaces.
//• Hint: Use trim() to remove leading and trailing spaces. Then use split("\\s+") to split the
//string by one or more spaces. The length of the resulting array is the word count.
//• Example:
//o Input: " Java is a powerful language "
//o Output: The number of words in the string is: 5
package Lec8_exercise;
import java.util.*;
/**
 *
 * @author THIEN QUOC AN
 */
public class Ex8_CountWordsInAString {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

       
        input = input.trim();

        if (input.isEmpty()) {
            System.out.println("The number of words in the string is: 0");
        } else {
          
            String[] words = input.split("\\s+");
            System.out.println("The number of words in the string is: " + words.length);
        }
    }
}
