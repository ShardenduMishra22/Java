package Basic_2;

public class DataTypes {
   public DataTypes() {}

   public static void main(String[] args) {
      byte num = 25;
      float flt = 5.75F;
      double dbl = 19.99;
      char chr = 'A';
      boolean bool = true;
      String str = "Hello, Java!";

      int[] intArray = {1, 2, 3, 4, 5};
      String[] strArray = {"Java", "Python", "C++", "JavaScript"};

      System.out.println("Integer: " + num);
      System.out.println("Float: " + flt);
      System.out.println("Double: " + dbl);
      System.out.println("Character: " + chr);
      System.out.println("Boolean: " + bool);
      System.out.println("String: " + str);

      System.out.print("Integer Array: ");
      for (int i : intArray) System.out.print(i + " ");
      
      System.out.print("\nString Array: ");
      for (String s : strArray) System.out.print(s + " ");
   }
}
