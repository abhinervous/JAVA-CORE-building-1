// Parent class
class Animal {

    // Method in parent class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (inherits Animal)
class Dog extends Animal {

    // Overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class MethodOverridingDemo {

    public static void main(String[] args) {

        // Parent class object
        Animal a = new Animal();
        a.sound();  // Calls parent method

        // Child class object
        Dog d = new Dog();
        d.sound();  // Calls overridden method

        // Parent reference, child object (Runtime Polymorphism)
        Animal obj = new Dog();
        obj.sound();  // Calls child method due to overriding
    }
}
