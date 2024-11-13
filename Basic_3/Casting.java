package Basic_3;

public class Casting {
    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 20;

        // Implicit Casting (int to double)
        double implicitResult = num1 + num2;
        System.out.println("Implicit Casting (int to double): " + implicitResult);

        // Explicit Casting (int to double for division)
        double explicitResult = (double) num1 / num2;
        System.out.println("Explicit Casting (int to double): " + explicitResult);

        // Explicit Casting (double to int)
        double num3 = 15.8;
        int castedInt = (int) num3;
        System.out.println("Explicit Casting (double to int): " + castedInt);
    }
}
