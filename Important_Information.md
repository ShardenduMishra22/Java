### 1. **`extends`**:
- **Used for Inheritance**: It is used when a class inherits from another class or when a class implements an abstract class.
- **Class-to-Class Inheritance**: If a class extends another class, it inherits the fields and methods of the parent class, and it can override methods of the parent class.
- **Can Be Used With**:
  - A **class** extending another **class** (including abstract classes).
  - An **interface** extending another **interface** (interfaces can inherit from other interfaces).
  
**Example**:
```java
class Dog extends Animal {
    // Inherits methods from Animal class and implements them
    void sound() {
        System.out.println("The dog barks.");
    }
}
```
Here, `Dog` extends `Animal`, meaning it inherits the `Animal` class’s behavior.

### 2. **`implements`**:
- **Used for Interface Implementation**: It is used when a class is implementing an **interface**.
- **Class-to-Interface Relationship**: If a class implements an interface, it must provide implementations for all of the interface's abstract methods.
- **Can Be Used With**:
  - A **class** implementing one or more **interfaces**.
  
**Example**:
```java
interface Animal {
    void sound();  // Abstract method in the interface
}

class Dog implements Animal {
    // Implements the sound method from the Animal interface
    public void sound() {
        System.out.println("The dog barks.");
    }
}
```
Here, `Dog` implements the `Animal` interface, meaning `Dog` must provide an implementation for the `sound()` method defined in the `Animal` interface.

---

### Key Differences:

| Feature                | `extends`                              | `implements`                              |
|------------------------|----------------------------------------|-------------------------------------------|
| **Purpose**             | Used for **inheritance** (class-to-class) | Used for **interface implementation**     |
| **Used With**           | A class extending another class or an interface extending another interface | A class implementing an interface         |
| **Inheritance**         | A class inherits fields and methods from another class | A class **does not** inherit fields or methods; it only provides implementations of interface methods |
| **Multiple Inheritance**| A class can extend only **one class**, but can extend multiple interfaces | A class can implement **multiple interfaces** |

### Example to Clarify the Difference:
```java
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
```

- **`Mammal` is an abstract class**: `Dog` extends `Mammal` to inherit its structure, so `Dog` must implement the abstract methods from `Mammal`.
- **`Animal` is an interface**: `Dog` implements `Animal` to provide concrete implementations of the methods defined in `Animal`.

### Summary:
- Use **`extends`** when a class inherits from another class (abstract or concrete) or when an interface extends another interface.
- Use **`implements`** when a class is providing implementations for methods defined in an interface.

