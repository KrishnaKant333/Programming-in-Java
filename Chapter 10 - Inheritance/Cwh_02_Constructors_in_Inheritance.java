class Base{
    Base(){
        System.out.println("I am a base class constructor");
    }    
    Base(int a){
        System.out.println("I am an overloaded constructor with parameter "+ a);
    }
}

class Derived extends Base{
    Derived(){
        // if overloaded constructors then default will be chosen
        // super(0); // super keyword for parameterised constructor
        System.out.println("I am a derived class constructor"); 
    } // the constructor of the base class is executed first
    Derived(int x, int y){
        super(x);
        System.out.println("I am a derived class overloaded constructor with parameters "+ x +" "+ y);
    }
}
class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I am the child of derived class");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor child of the derived class with parameters "+ x +" "+ y +" "+ z);
    }
}

public class Cwh_02_Constructors_in_Inheritance {
    public static void main(String[] args) {
        // Base b = new Base();
        // Derived d = new Derived();
        // Derived d = new Derived(14, 0);
        ChildOfDerived cd = new ChildOfDerived(2, 34, 76);
    }    
}
