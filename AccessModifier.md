In Java, access specifiers (or access modifiers) control the visibility and accessibility of classes, methods, and variables from other parts of the program. Here's what each specifier does:

1. **Public** (`public`):
   - **Visibility**: The element is accessible from **anywhere** in the program.
   - **Usage**: If a variable or method is `public`, it can be accessed from any other class, even outside the package.
   - Example: 
     ```java
     public int publicVar = 10; // Accessible from any other class
     ```

2. **Private** (`private`):
   - **Visibility**: The element is accessible **only within the class** where it is defined.
   - **Usage**: Variables or methods marked as `private` cannot be accessed from other classes, even subclasses.
   - Example:
     ```java
     private int privateVar = 20; // Only accessible within the Sample class
     ```

3. **Protected** (`protected`):
   - **Visibility**: The element is accessible **within the package** and **by subclasses** in other packages.
   - **Usage**: Commonly used to allow subclasses to inherit and access these variables or methods, but restricts access for classes that aren't in the package or subclasses.
   - Example:
     ```java
     protected int protectedVar = 30; // Accessible within package and subclasses
     ```

4. **Default** (no keyword):
   - **Visibility**: Accessible only **within the same package**.
   - **Usage**: The default access specifier is used when you don’t specify any keyword. Classes, methods, or variables with default access can be accessed only within the package.
   - Example:
     ```java
     int defaultVar = 40; // Accessible only within the package
     ```

### Key Differences:

- **Private vs. Public**: `private` restricts visibility to the defining class, while `public` allows visibility from any class or package.
- **Protected vs. Public**: `protected` allows access from subclasses and within the same package, while `public` has no restrictions.
- **Protected vs. Default**: `protected` extends visibility to subclasses outside the package, while `default` restricts access to within the package only.