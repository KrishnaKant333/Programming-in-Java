import java.util.Scanner;
public class pr02_07 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int sum = 0, i = 0;
        // int j = 2*i;
        while(i<n)
        {
            sum += (2*i);
            i++;
            // j = 2*i;
        }
        System.out.println("The sum of first " + n + " even numbers is " + sum);
        sc.close();
    }
}