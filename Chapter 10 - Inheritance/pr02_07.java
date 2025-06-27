import java.util.Scanner;

class Rectangle{
    public int l, b;
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    } 
    public int area(){
        return l*b;
    }
}

class Cuboid extends Rectangle{
    public int h;
    Cuboid(int l, int b, int h){
        super(l, b);
        this.h = h;
    }
    public int volume(){
        return area()*h;
    }
}

public class pr02_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the height of the cuboid:");
        int h = sc.nextInt();
        Cuboid c = new Cuboid(l, b, h);
        System.out.println("The area of the rectangle is :");
        System.out.println(c.area());
        System.out.println("The volume of the cuboid is :");
        System.out.println(c.volume());        
    }
}
