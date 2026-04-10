import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Initialize the Scanner
        Scanner sc = new Scanner(System.in);

        //Taking the number as input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        //Declaring and assigning the value (to 1) to the variable
        int fact = 1;

        // Loop for factorial
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        //Printing the result
        System.out.println("Factorial = " + fact);
    }
}