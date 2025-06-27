import java.util.Scanner;

class Cylinder{
    private final double radius, height;
    
    public Cylinder(double r, double h){
        radius = r;
        height = h;
    }

    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
}

public class pr03_06 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        double r1 = sc.nextFloat();
        System.out.println("Enter the height of the cylinder:");
        double h1 = sc.nextFloat();
        Cylinder c = new Cylinder(r1, h1);
        sc.close();
        System.out.print("The radius of the cylinder is : ");
        System.out.println(c.getRadius());
        System.out.print("The height of the cylinder is : ");
        System.out.println(c.getHeight());
    }
}
