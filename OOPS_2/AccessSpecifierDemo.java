// Main class to run the program
public class AccessSpecifierDemo {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.display(); // Display variables within the Sample class

        System.out.println("\nAccessing from main class:");
        System.out.println("Public Var: " + sample.publicVar);     // Accessible

        // System.out.println("Private Var: " + sample.privateVar); // ERROR: Not accessible
        System.out.println("Protected Var: " + sample.protectedVar); // Accessible if in same package
        System.out.println("Default Var: " + sample.defaultVar);   // Accessible if in same package

        // Using subclass
        ExtendedSample extendedSample = new ExtendedSample();
        extendedSample.showInherited(); // Demonstrates inherited access

        // Using same-package class
        SamePackageClass samePackageClass = new SamePackageClass();
        samePackageClass.showAccess(); // Demonstrates access within the same package
    }
}

// Define a subclass to show access to inherited members
class ExtendedSample extends Sample {
    public void showInherited() {
        System.out.println("Within ExtendedSample subclass:");
        System.out.println("Public Var: " + publicVar);        // Accessible
        // System.out.println("Private Var: " + privateVar);    // ERROR: Not accessible
        System.out.println("Protected Var: " + protectedVar);  // Accessible because it's protected
        System.out.println("Default Var: " + defaultVar);      // Accessible because it's in the same package
    }
}

// Another class in the same package
class SamePackageClass {
    public void showAccess() {
        Sample sample = new Sample();
        System.out.println("Within SamePackageClass:");
        System.out.println("Public Var: " + sample.publicVar);     // Accessible
        // System.out.println("Private Var: " + sample.privateVar); // ERROR: Not accessible
        System.out.println("Protected Var: " + sample.protectedVar); // Accessible in same package
        System.out.println("Default Var: " + sample.defaultVar);   // Accessible in same package
    }
}