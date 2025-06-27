import java.util.Scanner;

class Cylinder{
    private double radius, height;
    
    public void setRadius(double r){
        this.radius = r;
    }
    public void setHeight(double h){
        this.height = h;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
}


public class pr01_04 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder c = new Cylinder();
        System.out.println("Enter the radius of the cylinder:");
        c.setRadius(sc.nextFloat());
        System.out.println("Enter the height of the cylinder:");
        c.setHeight(sc.nextFloat());
        sc.close();
        System.out.println("The radius and height of the cylinder are :");
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());
    }
}
