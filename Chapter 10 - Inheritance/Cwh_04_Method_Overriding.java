class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void method2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override //annotation recommended 
    public void method2(){ // this is method overriding only until the arguments and access modifier are same
        System.out.println("I am method 2 of class B");
    }
    public void method3(){
        System.out.println("I am method 3 of class B");
    }
}

public class Cwh_04_Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();
        
        B b = new B();
        b.method2();
    }
}
