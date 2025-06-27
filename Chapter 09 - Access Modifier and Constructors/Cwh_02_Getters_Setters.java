import java.util.Scanner;

class Circle{
    private int r;

    public void setRadius(int r1){
        r = r1;
    }     
    public double getArea(){
        return 3.14*r*r;
    } 
    public double getPerimeter(){
        return 2*3.14*r;
    }     
}


public class Cwh_02_Getters_Setters {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("Enter the radius:");
        c.setRadius(sc.nextInt());
        sc.close();
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
}
