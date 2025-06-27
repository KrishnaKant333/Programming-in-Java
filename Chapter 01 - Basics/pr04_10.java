import java.util.Scanner;
public class pr04_10 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of kilometers:");
        double km = sc.nextFloat();
        double miles =  km * 0.621371;
        System.out.println(km + " Kilometeres = " + miles + " Miles");
        sc.close();        
    }
}
