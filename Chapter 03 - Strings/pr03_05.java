import java.util.Scanner;
public class pr03_05 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String print = "Dear <|name|>, Thanks a lot";
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        print = print.replace("<|name|>", name);
        System.out.println(print);
        sc.close();
    }
}