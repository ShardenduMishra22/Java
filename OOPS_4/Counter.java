package OOPS_4;

public class Counter {
    static int count = 0; // Shared across all instances of Counter

    Counter() {
        count++; // Incrementing the static variable
        System.out.println("Current count: " + count);
    }

    // Static method
    public static void displayCount() {
        System.out.println("Total count is: " + count);
    }
}


