// Hello World Program
//Here  public is an access modifier that makes the class accessible to all other classes
//class is a reserved keyword used to declare a new class
//HelloWorld is the name of the class
public class HelloWorld {
    //public : Allows the JVM to access the method from anywhere

    //static : Indicates that the method belongs to class itself ,not an object of the class

    //void : Specifies that this method does not return any value

    //main : The specific name the JVM looks for to start the program

    //String[] args : A parameter that accepts an array of strings as command-line arguments when the program is executed
    public static void main(String[] args) {
        // Prints message on screen

        //System : A built-in class that provides access to the system

        //out : A static member of the System class representing the standard output stream

        //println() : A method used tto print the text inside the parenthesis followed by a line

        //and the main thing ;
        System.out.println("Hello, World!");
    }
}
//Output : Hello , World!
