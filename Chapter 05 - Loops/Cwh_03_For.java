import java.util.Scanner;
public class Cwh_03_For {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // for(int i = 1; i<=10; i++)
        // {
        //     System.out.println(i);
        // }

        // print first n odd numbers
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i<=n; i++)
        {
            System.out.println(2*i-1);
        }

        // print first odd numbers upto n
        // System.out.println("Enter n");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.close();
        // int i = 1, p = 2*i-1;
        // for(p = 2*i-1; p<=n; p = 2*i-1)
        // {
        //     System.out.println(p);
        //     i++;
        // }
    }
}