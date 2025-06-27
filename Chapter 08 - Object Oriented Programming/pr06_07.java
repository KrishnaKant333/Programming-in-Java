import java.util.Scanner;

class Circle{
    int r;
    public double area(){
        return 3.14*r*r;
    }
    public double perimeter(){
        return 2*3.14*r;
    }
}

public class pr06_07 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Circle c = new Circle();
        System.out.println("Enter the radius:");
        c.r = sc.nextInt();
        sc.close();
        System.out.println("The area of the circle is "+ c.area());
        System.out.println("The area of the circle is "+ c.perimeter());
    }
}