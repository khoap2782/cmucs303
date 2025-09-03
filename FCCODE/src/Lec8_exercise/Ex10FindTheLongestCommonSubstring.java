/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Find the Longest Common Substring
//• Description: Write a method that takes two strings and finds the longest substring that
//appears in both of them.
//• Hint: This is a challenging problem. A simple approach is to use nested loops to generate all
//possible substrings of the shorter string, then check if that substring exists in the longer
//string using the contains() method. Keep track of the longest valid substring you find.
//• Example:
//o Input: "ABCDEF" and "XBCYDEFZ"
//o Output: "CDEF
package Lec8_exercise;

/**
 *
 * @author THIEN QUOC AN
 */
public class Ex10FindTheLongestCommonSubstring {
     public static String findLongestCommonSubstring(String s1, String s2) {
        
        if (s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        String longest = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String sub = s1.substring(i, j);
                if (s2.contains(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String str1 = "ABCDEF";
        String str2 = "XBCYDEFZ";
        System.out.println("Longest Common Substring: " + findLongestCommonSubstring(str1, str2));
    }
}
