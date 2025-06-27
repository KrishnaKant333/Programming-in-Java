interface DemoAno {
    void meth1();

    void meth2();
}

// class AnonyDemo implements DemoAno{

// public void display(){
// System.out.println("Hello");
// }

// @Override
// public void meth1() {
// System.out.println("I am meth1");
// }

// @Override
// public void meth2() {
// System.out.println("I am meth2");
// }
// }

// instead of making a whole class for one time use we can directly assign an
// object of a anonymous class to the reference of an interface
public class Cwh_02_Anonymous_Classes {
    public static void main(String[] args) {
        // AnonyDemo obj = new AnonyDemo();
        // obj.meth1();

        DemoAno obj = new DemoAno() {

            @Override
            public void meth1() {
                System.out.println("I am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth2");
            }

        };
        obj.meth1();
    }
}
