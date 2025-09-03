/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Create an Acronym
//• Description: Write a program that creates an acronym from a given phrase by taking the
//first letter of each word and capitalizing it.
//• Hint: Split the phrase into individual words. For each word, get the first character using
//charAt(0) and append it to a result string.
//• Example:
//o Input: "Object Oriented Programming"
//o Output: "OOP"
package Lec8_exercise;
import java.util.Scanner;
/**
 *
 * @author THIEN QUOC AN
 */
public class Ex7_CreateAnAcronym {
      public static String createAcronym(String phrase) {
       
        String[] words = phrase.trim().split("\\s+");
        StringBuilder acronym = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                
                acronym.append(Character.toUpperCase(word.charAt(0)));
            }
        }

        return acronym.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phrase = sc.nextLine();

        String result = createAcronym(phrase);
        System.out.println("Acronym: " + result);
    }
}
