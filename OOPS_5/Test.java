package OOPS_5;

class Car {
    String model;
    int year;

    // No-arg constructor
    Car() {
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
