/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec8_exercise;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author THIEN QUOC AN
 */
// Check for Anagrams
//• Description: Two strings are called Anagrams if they contain the same characters in the
//same quantities, but possibly in a different order. Write a method to check if two strings are
//Anagrams.
//• Hint: Convert both strings to lowercase. Convert them to character arrays using
//toCharArray(). Sort both arrays using Arrays.sort(). Finally, compare the two sorted arrays.
//• Example:
//o Input: "listen" and "silent"
//o Output: The two strings are Anagrams.
//o Input: "hello" and "world"
//o Output: The two strings are not Anagrams.

public class Ex4_check_for_Anagrams {
    public static boolean isAnagram(String s1, String s2){
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();
        
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] arr1 =s1.toCharArray();
        char[] arr2 =s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        if (isAnagram(str1, str2)){
            System.out.println("The two strings are anagram.");
        }else{
            System.out.println("The two strings are not anagram.");
        }
    }
}