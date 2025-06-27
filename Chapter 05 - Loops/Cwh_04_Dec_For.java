import java.util.Scanner;
public class Cwh_04_Dec_For {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // for (int i = 5; i>0 ; i--) {
        //     System.out.println(i);
        // }

        System.out.println("Enter n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("First n natural numbers in reverse order:");
        for(int i = n; i>0; i--)
        {
            System.out.println(i);
        }
    }
}