// Example of a class and an object in Java
class Car {
    // Properties (attributes)
    String color;
    String model;

    // Method (behavior)
    void display() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";
        car1.model = "Sedan";
        car1.display();
    }
}
