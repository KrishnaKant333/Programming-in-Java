import java.util.Scanner;
public class pr06_09 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website:");
        String website = sc.nextLine();
        sc.close();
        if(website.endsWith(".com"))
        {
            System.out.println("Commercial Website");
        }
        else if(website.endsWith(".org"))
        {
            System.out.println("Organization Website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("Indian Website");
        }
        else
        {
            System.out.println("Other Website");
        }
    }
}