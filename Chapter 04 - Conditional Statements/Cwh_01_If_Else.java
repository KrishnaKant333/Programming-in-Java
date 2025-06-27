import java.util.Scanner;
public class Cwh_01_If_Else {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age>18)        
        {
            System.out.println("You can drive");
        }
        else
        {
            System.out.println("You cannot drive");
        } // else is optional but if condition is not satisfied, no output will be received
        sc.close();
    }
}
