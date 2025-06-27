import java.util.Scanner;
class NegativeDimensionException extends Exception{

    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Please enter valid radius";
    }    
}

public class Cwh_09_Throw_Throws {

    public static double area(int r) throws NegativeDimensionException{
        if(r<0){
            throw new NegativeDimensionException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        int radius = sc.nextInt();
        System.out.println("The area of the circle is : ");
        try {
            System.out.println(area(radius));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
