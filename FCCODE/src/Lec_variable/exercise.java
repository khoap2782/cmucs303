/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec_variable;

public class exercise {
    public static void main(String[] args) {
        //exercise 1
    int a = 1 + 2;
    System.out.println("1 + 2 = " + a);
    double b = 3.5 + 8;
    System.out.println("3.5 + 8 = " + b);
    int c = 1/2;
    System.out.println("1/2 = " + c);
    double d = 4.5 + 7;
    System.out.println("4.5 + 7 = " + d);
    int e = 4*5+1;
    System.out.println(" 4 * 5 + 1 = " + e);
    int f = 20%3+2-7;
    System.out.println("20 % 3 + 2 - 7 = " + f);
    
    //Exercise 21 
    int x= 1;
    int y= x + ++x - x-- - x++ + x -x--;
    System.out.println("x = "+x);
    System.out.println("y = "+y);
    //Exercise 22
    int u = 1;
    int z = x - x-- - x++ + --x -x + x-- +x; 
     System.out.println("u = "+u);
    System.out.println("y = "+z);
}
}
