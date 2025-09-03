/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec8_exercise;
import java.util.*;
/**
 *
 * @author THIEN QUOC AN
 */
public class Ex9_FormatANumberString {
     public static String formatNumber(String digits) {
        StringBuilder sb = new StringBuilder(digits);

        int count = 0;
        
        for (int i = sb.length() - 1; i > 0; i--) {
            count++;
            if (count % 3 == 0) {
                sb.insert(i, ",");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number string: ");
        String input = sc.nextLine().trim();

        String formatted = formatNumber(input);
        System.out.println("Formatted number: " + formatted);
    }
}
