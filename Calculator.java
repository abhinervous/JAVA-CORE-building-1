import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Initialize the Scanner
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // Operator input
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;

        // Performing operation
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        //Printing the result
        System.out.println("Result = " + result);
    }
}