import java.util.Scanner;
class Circle{
    public int radius;

    Circle(int r){
        this.radius = r;
    }
    
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;

    Cylinder(int r, int h){
        super(r);
        this.height = h;
    }

    public double volume(){
        return area()*this.height;
    }
}

public class pr01_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int r = sc.nextInt();
        // Circle cr = new Circle(r);
        System.out.println("Enter the height of the cylinder:");
        int h = sc.nextInt();
        Cylinder cy = new Cylinder(r, h);
        System.out.println("The area of the circle is : ");
        System.out.println(cy.area());
        System.out.println("The volume of the cylider is : ");
        System.out.println(cy.volume());
    }
}
