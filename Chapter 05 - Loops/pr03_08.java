import java.util.Scanner;
public class pr03_08 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Multiplication table of " + n + " is: ");
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + "X" + i + " = " + (n*i));
            // System.out.printf("%dX%d = %d\n", n, i, n*i);
        }
    }
}