import java.util.Scanner;
import java.util.Arrays;

public class ArrayProgram {
    public static void main(String[] args) {

        //Initialize the Scanner
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        //Declaring the variable and assigning the input values for array formation
        int arr[] = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting array
        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Searching element
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        int index = Arrays.binarySearch(arr, key);

        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}