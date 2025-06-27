package Java.Packages;

// import java.util.Scanner; // import Scanner from util
// import java.util.*; // import everything from util 

public class Cwh_01_Built_in_Packages {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // use Scanner without importing package
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("I am class harry's main method with a = " + a);
    }
}
