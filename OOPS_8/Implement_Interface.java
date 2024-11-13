package OOPS_8;

interface Animal {
    void sound();  // Interface method
}

abstract class Mammal {
    abstract void walk();  // Abstract method
}

class Dog extends Mammal implements Animal {
    // Implements the sound method from Animal interface
    public void sound() {
        System.out.println("The dog barks.");
    }

    // Provides implementation for walk method from Mammal abstract class
    void walk() {
        System.out.println("The dog walks.");
    }
}
