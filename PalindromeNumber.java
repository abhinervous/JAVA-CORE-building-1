import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        //Initialize the Scanner
        Scanner sc = new Scanner(System.in);

        //Taking a number as input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        //Declaring and assigning the values to variables
        int original = num;
        int reverse = 0;

        // Reverse number
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        // Check palindrome
        if (original == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}