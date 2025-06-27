import java.util.Scanner;
public class Cwh_05_VarArgs {
    static int sum(int ...arr) { // takes variable arguments in the form of an array
        int result = 0;
        for(int a : arr) {
            result += a;
        }
        return result;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        // System.out.println("The sum of 2,4 is " + sum(2,4));
        // System.out.println("The sum of 2,4,6 is " + sum(2,4,6));
        // System.out.println("The sum of 2,4,6,8 is " + sum(2,4,6,8));

        System.out.println("Enter how many numbers to sum  :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the numbers:");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of the numbers is : " + sum(arr));
        sc.close();
    }
}