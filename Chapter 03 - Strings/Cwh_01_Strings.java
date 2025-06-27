import java.util.Scanner;
public class Cwh_01_Strings {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        @SuppressWarnings("RedundantStringConstructorCall")
        String name = new String("Krishnakant"); // String is a class in java
        // String name = "Krishnakant"; // This is also a way to create a string in java
        System.out.print("The name is : " );
        System.out.println(name);

        int a = 5;
        float b = 10.29f;
        System.out.printf("The value of a is %d and b is %f\n", a, b);
        System.out.format("The value of a is %d and b is %f", a, b);

        System.out.println("\n");
        // Taking input from the user
        System.out.print("Enter your name: ");
        // String name1 = sc.next(); // It will take only one word as input
        // System.out.println("Your name is " + name1);
        
        String name2 = sc.nextLine(); // It will take the whole line as input
        System.out.println("Your name is " + name2);
        sc.close();
    }
}