import java.util.Scanner;
public class pr03_10 {
    static int sum(int n) {
        return switch(n) {
            case 1 -> 1;
            default -> n + sum(n-1);
        };
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("The sum of first " + n + " natural numbers is : " + sum(n));
    }
}