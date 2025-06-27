import java.util.Scanner;
public class Cwh_06_Recursion {
    static int fact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial is to be calculated:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("The factorial of " + n + " is : " + fact(n));        
    }
}