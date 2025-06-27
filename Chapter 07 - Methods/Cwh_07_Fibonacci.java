import java.util.Scanner;
public class Cwh_07_Fibonacci {
    static int fib(int n) {
        return switch (n) {
            case 0 -> 0;
            case 1, 2 -> 1;
            default -> fib(n-1) + fib(n-2);
        };
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms of the Fibonacci series to print :");
        int n = sc.nextInt();
        sc.close();
        if (n <= 0) {
            System.out.println("Number of terms must be positive only");
        }
        else {
            System.out.println("The Fibonacci Series upto " + n + "th term is :");
            for(int i = 0; i <= n; i++) {
                System.out.print(fib(i) + " ");
            }
        }
    }
}