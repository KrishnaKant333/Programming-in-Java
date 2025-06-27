import java.util.Scanner;

public class pr08_15 {
    static void pattern(int n) {
        if(n>0) {
            pattern(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("The increasing star pattern of " + n + " rows and " + n + " columns is: ");
        pattern(n);        
    }
}