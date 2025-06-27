package Java.Exercises;

import com.codewithharry.shape.*;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int prompt;
            System.out.println("\nWelcome to the Area and Volume Calculator of some commonly known 2D and 3D figures!");
            do{                
                System.out.println("\n1 : For Square");
                System.out.println("2 : For Rectangle");
                System.out.println("3 : For Circle");
                System.out.println("4 : For Cube");
                System.out.println("5 : For Cuboid");
                System.out.println("6 : For Cylinder");
                System.out.println("7 : For Sphere");
                System.out.println("0 : To exit");
                System.out.println("Enter you choice");
                prompt = sc.nextInt();
                sc.nextLine();
                switch (prompt) {
                    case 1 -> {
                        System.out.println("Enter the side length of the square :");
                        int side_square = sc.nextInt();
                        Square sq = new Square(side_square);
                        System.out.println("The area of the square is : " + sq.area());
                    }
                    case 2 -> {
                        System.out.println("Enter the length and breadth of the rectangle :");
                        int length_s = sc.nextInt();
                        int breadth_s = sc.nextInt();
                        Rectangle rect = new Rectangle(length_s,breadth_s);
                        System.out.println("The area of the rectangle is : " + rect.area());
                    }
                    
                    case 3 -> {
                        System.out.println("Enter the radius of the circle :");
                        int radius_circ = sc.nextInt();
                        Circle circ = new Circle(radius_circ);
                        System.out.println("The area of the circle is : " + circ.area());
                    }
                    
                    case 4 -> {
                        System.out.println("Enter the side length of the cube :");
                        int side_cube = sc.nextInt();
                        Cube cu = new Cube(side_cube);
                        System.out.println("The area of the cube is : " + cu.area());
                        System.out.println("The volume of the cube is : " + cu.volume());
                    }
                    
                    case 5 -> {
                        System.out.println("Enter the length, breadth and height of the cuboid  :");
                        int length_c = sc.nextInt();
                        int breadth_c = sc.nextInt();
                        int height_c = sc.nextInt();
                        Cuboid cub = new Cuboid(length_c, breadth_c, height_c);
                        System.out.println("The area of the cuboid is : " + cub.area());
                        System.out.println("The volume of the cuboid is : " + cub.volume());
                    }
                    
                    case 6 -> {
                        System.out.println("Enter the base radius and height of the cylinder :");
                        int radius_cyl = sc.nextInt();
                        int height_cyl = sc.nextInt();
                        Cylinder cyl = new Cylinder(radius_cyl, height_cyl);
                        System.out.println("The area of the cylinder is : " + cyl.area());
                        System.out.println("The volume of the cylinder is : " + cyl.volume());
                    }
                    
                    case 7 -> {
                        System.out.println("Enter the radius of the sphere :");
                        int radius_sph = sc.nextInt();
                        Sphere sph = new Sphere(radius_sph);
                        System.out.println("The area of the sphere is : " + sph.area());
                        System.out.println("The volume of the sphere is : " + sph.volume());
                    }
                    
                    case 0 -> {
                        System.out.println("Thank you for using the calculator.");
                        System.exit(0);
                    }
                    default -> System.out.println("Please enter a valid number!!");
                }
                sc.nextLine();
            }while(prompt!=0);
        }
    }
}
