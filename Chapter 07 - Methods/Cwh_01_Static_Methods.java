public class Cwh_01_Static_Methods {
    static int add(int x, int y) {
        int z;
        z = x + y;
        return z;
    }
    public static void main(String[] args) {
        int a = 1, b = 1, c;
        c = add(a,b);
        System.out.println(c);
    }
} // object is not required to call a static method