import java.util.Scanner;
public class pr02_08 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Enter marks in 3 subjects:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in Physics:");
        int phy = sc.nextInt();
        System.out.println("Enter marks in Chemistry:");
        int chem = sc.nextInt();
        System.out.println("Enter marks in Mathematics:");
        int math = sc.nextInt();

        float cgpa = (float)(phy + chem + math) / 30;
        System.out.println("CGPA = " + cgpa);
        sc.close();
    }
}
