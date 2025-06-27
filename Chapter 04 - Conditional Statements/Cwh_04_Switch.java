import java.util.Scanner;

public class Cwh_04_Switch {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        // Normal Switch Case
        // switch (choice) {
        //     case 1:
        //         System.out.println("You are in case 1");
        //         break;
        //     case 2:
        //         System.out.println("You are in case 2");
        //         break;
        //     case 3:
        //         System.out.println("You are in case 3");
        //         break;
        //     case 4:
        //         System.out.println("You are in case 4");
        //         break;
        //     default:
        //         System.out.println("You are in default");
        //         break;
        // }

        // Enhanced Switch Case
        switch (choice) {
            case 1 -> System.out.println("You are in case 1");
            case 2 -> System.out.println("You are in case 2");
            case 3 -> System.out.println("You are in case 3");
            case 4 -> System.out.println("You are in case 4");
            default -> System.out.println("You are in default");
        }
        sc.close();
    }
}