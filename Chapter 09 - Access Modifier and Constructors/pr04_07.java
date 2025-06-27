import java.util.Scanner;

class Sphere{
    private double radius;

    public void setRadius(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }

    public double SurfaceArea(){
        return 4*3.14*radius*radius;
    }
    public double Volume(){
        return 1.33*3.14*radius*radius*radius;
    }
}

public class pr04_07 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sphere s = new Sphere();
        System.out.println("Enter the radius of the Sphere:");
        s.setRadius(sc.nextFloat());
        sc.close();
        System.out.print("The surface area of the sphere is : ");
        System.out.println(s.SurfaceArea());

        System.out.print("The volume of the sphere is : ");
        System.out.println(s.Volume());
    }
}
