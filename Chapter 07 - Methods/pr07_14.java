import java.util.Scanner;
public class pr07_14 {
    static void pattern(int n) {
        if(n>0) {
            for(int i = n; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
            pattern(n-1);
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