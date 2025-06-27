import java.util.Scanner;
public class pr10_17 {
    static int sum(int n) {
        int s = 0;
        for(int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
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