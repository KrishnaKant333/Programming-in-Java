import java.util.Scanner;
public class Ex01 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float total = 500.0f;
        System.out.println("Enter your marks in 5 subjects");
        System.out.println("Hindi: ");
        int h = sc.nextInt();
        System.out.println("English: ");
        int e = sc.nextInt();
        System.out.println("Mathematics: ");
        int m = sc.nextInt();
        System.out.println("Physics: ");
        int p = sc.nextInt();
        System.out.println("Computer Science: ");
        int c = sc.nextInt();
        
        int sum = h + e + m + p + c;
        float percentage = (sum/total)*100;
        System.out.println("Total marks = " + sum);
        System.out.println("Percentage = " + percentage);
        sc.close();
    }
}
