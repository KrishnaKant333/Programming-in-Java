import java.util.Scanner;

class SqrtFinder{
    public static double calculateSquareRoot(int n) throws IllegalArgumentException{
        if(n<0){
            throw new IllegalArgumentException("The number must be non negative!!");
        }
        return Math.sqrt(n);
    }
}

public class pr01_12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        try {
            System.out.println("The square root of the number is :");
            System.out.println(SqrtFinder.calculateSquareRoot(number));            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Hihihihihihihihihihi");
        }
    }
}