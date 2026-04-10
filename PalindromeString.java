import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        //Initialize the Scanner
        Scanner sc = new Scanner(System.in);
        
        //Taking the input string from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        //Declares and initialize the variable ( empty string literal )
        String reverse = "";

        // Reverse string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Check palindrome
        if (str.equals(reverse)) {
            System.out.println("Palindrome string");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}