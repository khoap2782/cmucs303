/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC5_EXERCISE;
import java.util.Random;
/**
 *
 * @author THIEN QUOC AN
 */
public class Exercise11_Roll_Doubles {
    public static void main(String args[]){
    Random rand = new Random();
    int count = 0;
    int dice1, dice2;
    do {
        //từ 1 đến 6
        dice1 = rand.nextInt(6) +1; 
        dice2 = rand.nextInt(6) +1;
        count ++;
        System.out.println("Roll " + count + ": " + dice1 + " and " + dice2);
    }while (dice1 !=dice2);
    System.out.println("U rolled doubles after " + count + " tries");
 }
}
