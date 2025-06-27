import java.util.Scanner;
public class pr05_11 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer :");
        boolean check = sc.hasNextInt();
        if (check)
        {
            System.out.println("The number is an integer");
        }
        else
        {
            System.out.println("The number is not an integer");
        }
        sc.close();
    }
}
