import java.util.Scanner;
public class pr05_12 {
    static int fib(int n) {
        return switch (n) {
            case 1 -> 0;
            case 2 -> 1;
            default -> fib(n-1) + fib(n-2);
        };
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("The " + n + "th term of the Fibonacci Series is : " + fib(n));
    }
}
