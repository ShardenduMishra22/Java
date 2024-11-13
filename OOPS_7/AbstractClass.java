package OOPS_7;

abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();

    // Regular method (non-abstract)
    void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    // Providing implementation for the abstract method
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // We cannot create an instance of the abstract class directly
        // Animal animal = new Animal(); // This line would give an error

        // But we can create objects of classes that extend the abstract class
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling methods on the objects
        dog.sound(); // Output: The dog barks.
        dog.eat();   // Output: This animal is eating.
        
        cat.sound(); // Output: The cat meows.
        cat.eat();   // Output: This animal is eating.
    }
}


// Abstract class (Animal): This class cannot be instantiated directly. It may contain both abstract methods (without implementation) and non-abstract methods (with implementation).
// Abstract method (sound()): This is a method that does not have a body in the abstract class. It must be implemented in the subclasses that inherit from Animal.
// Concrete classes (Dog and Cat): These classes extend the Animal class and provide their own implementations of the sound() method.
// Main method: In the main() method, you can create instances of Dog and Cat, which are concrete classes that provide the necessary implementations of the abstract methods.