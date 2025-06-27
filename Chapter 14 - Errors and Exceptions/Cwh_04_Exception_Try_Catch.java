import java.util.Scanner; 
public class Cwh_04_Exception_Try_Catch {
    public static void main(String[] args) {
        // 2 types of exception in java : 
        // 1. Checked Exception --> Handled by Compiler 
        // 1. Unchecked Exception --> Ignored by Compiler 
        
        // Commonly occuring exceptions :
        // 1. NullPointer 
        // 2. Arithmetic
        // 3. ArrayIndexOutOfBound
        // 4. IllegalArgument
        // 5. NumberFormat 
        
        // Try-Catch Block :
        
        int a = 6000;
        // int b = 0;
        // int c = a/b;
        // System.out.println("The result is " + c);
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at Cwh_04_Exception_Try_Catch.main(Cwh_04_Exception_Try_Catch.java:18)
        
        
        // So we wrap our code which may throw exception inside a try block
        Scanner sc = new Scanner(System.in);
        int b;
        System.out.println("Enter divisor:");
        b = sc.nextInt();
        try {
            int c = a/b;
            System.out.println("The result is "+c);
        } catch (Exception e) {
            System.out.println("We failed to divide. Reason : ");
            System.out.println(e);
        }
        System.out.println("End of the program");

        // if try catch had not been used the end of the program statement will not be shown but the program will terminate after encountering the exception at int c = a/b
    }
}
