import java.util.Scanner;
public class pr04_11 {
    static void pattern(int n) {
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }
}