public class MethodOverloading {

    // Method with 2 integers
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // Method with 3 integers
    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    // Method with double values
    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }
    //As we see that we defined multiple methods within the same class with same names but different parameter signatures.
    
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.add(2, 3);          // Calls first method
        obj.add(2, 3, 4);       // Calls second method
        obj.add(2.5, 3.5);      // Calls third method
    }
}