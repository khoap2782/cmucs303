
//: Remove Duplicate Elements (ArrayList)
//• Description: Write a method that takes an ArrayList of integers, which may contain
//duplicates, and returns a new ArrayList that does not contain any duplicate elements.
//• Hint: Create a new empty ArrayList for the results. Traverse the original ArrayList. For each
//element, check if it already exists in the result ArrayList. If not, add it.
//• Example:
//o Input: [1, 3, 2, 1, 4, 3, 5]
//o Output: [1, 3, 2, 4, 5]
package LEC7_EXERCISE;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author THIEN QUOC AN
 */
public class exercise7_Remove_Duplicate_Elements {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (!result.contains(num)) { // chỉ thêm nếu chưa có
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        
        ArrayList<Integer> result = removeDuplicates(numbers);
        
        System.out.println("ArrayList without duplicates: " + result);

        sc.close();
    }
}
