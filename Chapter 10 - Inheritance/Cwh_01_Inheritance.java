class Base{ //Super class parent class base class
    public int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am the base class");
    }
}

class Derived extends Base{ //Sub class child class derived class
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}

public class Cwh_01_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        Derived b1 = new Derived();
        b1.setX(5);
        b1.setY(6);
        b1.printMe();
        System.out.println(b1.getX()+b1.getY());
    }
}
