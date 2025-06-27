import java.util.Scanner;

class Rectangle{
    private final int length, breadth;

    public Rectangle(){
        length = 4;
        breadth = 5;
    }

    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}

public class pr05_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.println("Default Parameters of the rectangle are: ");
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        System.out.println("Enter new length:");
        int l = sc.nextInt();
        System.out.println("Enter new breadth:");
        int b = sc.nextInt();
        sc.close();
        Rectangle r1 = new Rectangle(l, b);
        System.out.println("New parameters of the rectangle are: ");
        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
    }
}
