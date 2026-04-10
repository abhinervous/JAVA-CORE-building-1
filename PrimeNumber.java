import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //Initialize the Scanner
        Scanner sc = new Scanner(System.in);
        //Taking a number from user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //Assigning initial value to variable
        boolean isPrime = true;

        // Check prime
        if (num <= 1) {
            isPrime = false; //Prime number can't be 0 or negative integer
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; //It means loop is exhausted and we found that it is non prime number
                    break;
                }
            }
        }
        //Declaring the result to print
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}