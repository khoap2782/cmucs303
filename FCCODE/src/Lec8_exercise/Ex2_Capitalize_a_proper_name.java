/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Capitalize a Proper Name
//• Description: Ask the user to input a full name (which may have inconsistent capitalization
//and extra spaces). Write a program to normalize this name so that each word is capitalized
//(the first letter is uppercase, and the rest are lowercase).
//• Hint: Use trim() to remove leading/trailing spaces, then split() by one or more spaces
//("\\s+"). For each word, use substring() combined with toUpperCase() and toLowerCase() to
//normalize it, and finally join them back together.
//• Example:
//o Input: " ngUYen vAn a "
//o Output: "Nguyen Van A"

package Lec8_exercise;
import java.util.Scanner;
/**
 *
 * @author THIEN QUOC AN
 */
public class Ex2_Capitalize_a_proper_name {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String input = sc.nextLine();
        
        String[] words = input.trim().split("\\s+");
        
        StringBuilder normalized = new StringBuilder();
        
        //xử lí từng từ 
        for (String word : words) {
            if (word.length() > 0){
                //viết hoa chữ cái đầu, còn lại viết thường
                String capitalized = word.substring(0, 1).toUpperCase()
                + word.substring(1).toLowerCase();
                normalized.append(capitalized).append(" ");
                
            }
        }
        String result = normalized.toString().trim();
        System.out.println("Normalized name: " + result);
    }
}
