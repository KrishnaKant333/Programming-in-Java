import java.util.Scanner;

class Cylinder{
    private double radius, height;
    
    public void setRadius(double r){
        radius = r;
    }
    public void setHeight(double h){
        height = h;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }

    public double SurfaceArea(){
        return 2*3.14*radius*(radius+height);
    }
    public double Volume(){
        return 3.14*radius*radius*height;
    }
}


public class pr02_05 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder c = new Cylinder();
        System.out.println("Enter the radius of the cylinder:");
        c.setRadius(sc.nextFloat());
        System.out.println("Enter the height of the cylinder:");
        c.setHeight(sc.nextFloat());
        sc.close();
        System.out.println("The surface area and volume of the cylinder are :");
        System.out.println(c.SurfaceArea());
        System.out.println(c.Volume());
    }
}
