import java.util.Scanner;
public class pr09_16 {
    static float convert(float c) {
        float f = (9*c)/5 + 32;
        return f;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Enter temperatrue in Celsius : ");
        Scanner sc = new Scanner(System.in);
        float Celsius = sc.nextFloat();
        sc.close();
        System.out.println("The same temperature in Fahreinheit is : " + convert(Celsius));
    }
}