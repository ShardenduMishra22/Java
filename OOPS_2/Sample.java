// Define a Sample class with different access levels
public class Sample {
    public int publicVar = 10;        // Public: accessible from anywhere
    private int privateVar = 20;      // Private: accessible only within Sample
    protected int protectedVar = 30;  // Protected: accessible within package and subclasses
    int defaultVar = 40;              // Default (no modifier): accessible within package only

    // Method to demonstrate access within the same class
    public void display() {
        System.out.println("Within Sample class:");
        System.out.println("Public Var: " + publicVar);
        System.out.println("Private Var: " + privateVar);
        System.out.println("Protected Var: " + protectedVar);
        System.out.println("Default Var: " + defaultVar);
    }
}