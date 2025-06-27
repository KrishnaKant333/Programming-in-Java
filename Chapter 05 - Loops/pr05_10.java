import java.util.Scanner;
public class pr05_10 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println("Factorial of " + n + " is " + f);
    }
}
