import java.util.Scanner;
public class pr02_06 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int [] arr = {32, 54, 56, 74, 23};
        System.out.println("Enter the number to search:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        boolean found = false;
        for(int element : arr) {
            if(num == element) {
                found = true;
                break;
            }
        }
        if(found == true) {
            System.out.println("The number is present in the array");
        }
        else {
            System.out.println("The number is not present in the array");
        }
    }
}