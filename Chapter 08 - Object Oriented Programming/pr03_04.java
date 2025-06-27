import java.util.Scanner;

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    } 
}

public class pr03_04 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
    Square sq = new Square();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side length:");
    sq.side = sc.nextInt();
    sc.close();
    System.out.println("The area of the square is " + sq.area());
    System.out.println("The perimeter of the square is " + sq.perimeter());
    }
}