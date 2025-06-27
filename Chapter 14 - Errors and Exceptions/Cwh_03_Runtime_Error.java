import java.util.Scanner;

public class Cwh_03_Runtime_Error {
    public static void main(String[] args) {
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k :");
        k = sc.nextInt();
        System.out.println("The integer part when 1000 is divided by k is " + 1000/k);

        // the runtime error here is when user enters k = 0 which will result in dividing by zero
    }
}
