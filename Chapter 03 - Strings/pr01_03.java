import java.util.Scanner;
public class pr01_03 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println("The given string in lowercase: " + str);
        sc.close();
    }
}
