/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//To-Do List Management (ArrayList)
//• Description: Write a program to manage a to-do list. Use an ArrayList<String> to store the
//tasks. The program should allow the user to:
//1. Add a new task.
//2. View all tasks.
//3. Remove a task by its position (index).
//• Hint: Use the add(), get(), remove(index), and size() methods of ArrayList. 
package LEC7_EXERCISE;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THIEN QUOC AN
 */
public class exercise4_To_Do_List_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        
        System.out.print("How many tasks do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter task " + (i + 1) + ": ");
            String task = sc.nextLine();
            tasks.add(task);
        }
        
        System.out.println("\nYour tasks: " + tasks);
        
        System.out.print("\nEnter index of task to remove: ");
        int index = sc.nextInt();

        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid index!");
        }
        
        System.out.println("Tasks after removal: " + tasks);

        sc.close();
    }
}
