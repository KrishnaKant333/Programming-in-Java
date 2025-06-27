public class Cwh_02_Non_Static {
    int add(int x, int y) {
        int z;
        z = x + y;
        return z;
    }
    public static void main(String[] args) {
        int a = 1, b = 1, c;
        Cwh_02_Non_Static obj = new Cwh_02_Non_Static();
        c = obj.add(a, b);
        System.out.println(c);
    }
} // object is required to call a non static method