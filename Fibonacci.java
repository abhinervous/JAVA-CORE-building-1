import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Initialize the Scanner
        Scanner sc = new Scanner(System.in);

        //Taking number of terms as input from user
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        //Declaring and Assigning the values to variables
        int a = 0, b = 1;
        
        //Printing statement for Fibonacci Series
        System.out.println("Fibonacci Series:");

        // Printing series
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}