abstract class Parent{

    Parent(){
        System.out.println("I am a constructor in Parent CLass");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
// abstract class ka obj nhi banta, usse inherited classes ka banta h
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
// inherited ka obj banane ke liye saare abstract methods implement kro
abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good boy");
    }

}
// nhi to dusri inherited class bana do
public class Cwh_01_Abstract_Classes_Methods {
    public static void main(String[] args) {
        // Parent p = new Parent; // not allowed as parent is abstract class
        Child c = new Child(); // allowed as all abstract methods are implemented
        // Child2 c2 = new Chil2(); // not allowed as abstract

        // reference of abstract class = obj of inherited concrete class can be implemented 
    }
}
