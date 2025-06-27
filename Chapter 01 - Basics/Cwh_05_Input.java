import java.util.Scanner;
public class Cwh_05_Input {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = x.nextInt();
        System.out.println("Enter second number:");
        int b = x.nextInt();
        int sum = a + b;
        System.out.print("Sum of the two numbers is ");
        System.out.println(sum);

        System.out.println("Enter an integer");
        boolean b1 = x.hasNextInt();
        System.out.println(b1);

        // char and string inputs
        
        // String c = x.next();
        // System.out.println(c);

        // String str = x.nextLine();
        // System.out.println(str);
        x.close();
    }
}
