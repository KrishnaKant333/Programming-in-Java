import java.util.Scanner;

class Rectangle{
    int l,b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    } 
}

public class pr04_05 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
    Rectangle rc = new Rectangle();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length :");
    rc.l = sc.nextInt();
    System.out.println("Enter the breadth :");
    rc.b = sc.nextInt();
    sc.close();
    System.out.println("The area of the rectangle is " + rc.area());
    System.out.println("The perimeter of the rectangle is " + rc.perimeter());
    }
}