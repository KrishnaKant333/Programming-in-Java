import java.util.Scanner;
public class pr03_06 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        System.out.print("Enter the income: ");
        float income = sc.nextFloat();
        sc.close();
        
        if(income < 2.5) {
            tax = tax + 0;
        }
        else if (income >= 2.5 && income < 5) {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income >= 5 && income < 10) {
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax + 0.1f * (income - 5f);
        }
        else if (income >= 10) {
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax + 0.1f * (10f - 5f);
            tax = tax + 0.2f * (income - 10f);
        }        
        System.out.println("Total tax: " + tax);
    }
}