@FunctionalInterface
interface LambdaDemo {
    void meth1();
}

interface DemoLambda {
    void meth2(int a);
}

// class Lambda implements DemoAno{
// public void meth1(){
// System.out.println("I am method 1");
// }
// }
public class Cwh_03_Lambda_Expressions {
    public static void main(String[] args) {
        // Lambda l = new Lambda();
        // l.meth1();

        // Lambda expressions are useful for functional interfaces so that we do not
        // have to create a class to implement a single abstract method

        LambdaDemo obj = () -> {
            System.out.println("I am method 1");
        };
        obj.meth1();
        
        DemoLambda obj1 = (a) -> {System.out.println("I am method 2 with value of a as " + a);};
        obj1.meth2(6);
    }
}
