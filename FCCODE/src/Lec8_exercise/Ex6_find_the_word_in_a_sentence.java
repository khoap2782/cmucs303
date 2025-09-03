/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//. Find the Longest Word in a Sentence
//• Description: Write a method that takes a sentence as input and finds the longest word within
//it. If there are multiple words with the same maximum length, return the first one found.
//• Hint: Split the sentence into an array of words. Iterate through the array and keep track of
//the word with the greatest length().
//• Example:
//o Input: "The quick brown fox jumps over the lazy dog"
//o Output: "quick"
package Lec8_exercise;
import java.util.*;
/**
 *
 * @author THIEN QUOC AN
 */
public class Ex6_find_the_word_in_a_sentence {
    public static String findLongestWord(String sentence){
        String[] words = sentence.trim().split("\\s+");
        
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " +longestWord);
        
    }
}
