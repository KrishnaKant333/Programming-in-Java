import java.util.Scanner;
public class pr01_08 {
    static void mult(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%dX%d = %d\n", n, i, n*i);
        }
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The multiplication table of " + n + " is :");
        mult(n);
        sc.close();
    }
}