import java.util.Scanner;
public class pr02_04 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with spaces involved: ");
        String str = sc.nextLine();
        str = str.replace(" ", "_");
        System.out.println("The given string with underscores: " + str);
        sc.close();
    }
}
