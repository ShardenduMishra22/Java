package Basic_8;

public class Methods {
    public static int PrintSum(int a, int b){
        return a+b;
    }
    
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        System.out.println("Sum of " + a + " and " + b + " is " + PrintSum(a,b));
    } 
}
