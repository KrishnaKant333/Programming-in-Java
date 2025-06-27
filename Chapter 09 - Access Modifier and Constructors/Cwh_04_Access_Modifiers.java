// package Java.Packages;

class C1{
    public int x = 5;
    protected int y = 45;
    int z = 6; //(default)
    private int a = 78;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        // any access modifier it may be, they will be accessible in the same class
    }
}


public class Cwh_04_Access_Modifiers {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.meth1();

        // System.out.println(c1.a); // private property cannot be accessed in the same package
    }
}
