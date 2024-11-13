package OOPS_4;

public class Test {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // Output: Current count: 1
        Counter c2 = new Counter(); // Output: Current count: 2
        
        // Accessing the static method without an instance
        Counter.displayCount(); // Output: Total count is: 2
    }
}