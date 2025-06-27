import java.util.Scanner;
public class pr02_05 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics: ");
        int phy = sc.nextInt();
        System.out.println("Enter your marks in Chemistry: ");
        int chem = sc.nextInt();
        System.out.println("Enter your marks in Mathematics: ");
        int math = sc.nextInt();
        sc.close();
        float total = (phy + chem + math)/3.0f;
        System.out.println("Your overall percentage is: " + total);

        if(total>=40 && phy>=33 && chem>=33 && math>=33)
        {
            System.out.println("You are pass!");
        }
        else
        {
            System.out.println("You are fail!");
        }
    }
}
