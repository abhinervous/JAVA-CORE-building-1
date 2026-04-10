import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        //Initialize the Scanner
        Scanner sc = new Scanner(System.in);

        //Taking an input number from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check condition
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}