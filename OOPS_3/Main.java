package OOPS_3;

class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass (or child class) using `extends` to inherit from Animal
class Dog extends Animal {
    String breed;

    // Method specific to Dog class
    public void bark() {
        System.out.println(name + " is barking.");
    }

    // Overriding the sleep method
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping soundly like a dog.");
    }
}

// Main class to run the example
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.breed = "Golden Retriever";

        // Inherited methods and fields
        dog.eat();   // Output: Buddy is eating.
        dog.sleep(); // Output: Buddy is sleeping soundly like a dog.
        
        // Dog-specific method
        dog.bark();  // Output: Buddy is barking.
    }
}
