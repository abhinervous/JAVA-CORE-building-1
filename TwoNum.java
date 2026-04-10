
import java.util.Scanner;

public class TwoNum{
      public static void main(String[] args){
            //Initialize the Scanner 
             Scanner sc = new Scanner(System.in);
             //Taking input of two numbers from user
             System.out.println("Enter two numbers");
             double a = sc.nextDouble();
             double b = sc.nextDouble();
             //Performing the addition operation on given inputs
             System.out.println("sum is "+(a+b));
             sc.close();
      }
}