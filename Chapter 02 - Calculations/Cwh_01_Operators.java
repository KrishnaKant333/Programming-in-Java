public class Cwh_01_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;

        // System.out.println((2*a)==b);

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a)); // % Modulus Operator works with floating point numbers too

        // Assignment Operators
        b += 3;
        a *= 3;
        System.out.println(b);
        System.out.println(a);

        // Relational Operators
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(b < c);

        // Logical Operators
        System.out.println((a > b) && (a > c));
        System.out.println((a < b) || (a < c));
    }
}
