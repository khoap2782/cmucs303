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
//. Reverse the Words in a Sentence
//• Description: Write a program that takes a sentence as input and reverses the order of the
//words in it, while keeping the order of characters within each word intact.
//• Hint: Use the split(" ") method to separate the sentence into an array of words. Then, iterate
//through this array backward and use a StringBuilder to join the words back into a new
//sentence.
//• Example:
//o Input: "Java is fun"
//o Output: "fun is Java"
public class Ex1_Reverse_the_Words_in_a_Sentence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        //tách mảng các từ split thoe khoảng trắng
        String[] words = sentence.trim().split("\\s+"); // \\s+: cắt khoảng trống ở giữa các chữ
        
        //dùng StringBuilder để ghép ngược lại 
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--){
            reversed.append(words[i]); // thêm từ hiện tại vào chuỗi
            if (i>0){
                reversed.append(" "); //chen khoang trang giua cac tu
            }
        }
        System.out.println("Reversed sentence: " + reversed);
    }
    }
    
