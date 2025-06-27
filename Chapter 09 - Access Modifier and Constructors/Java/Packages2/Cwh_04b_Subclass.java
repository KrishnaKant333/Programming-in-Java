package Java.Packages2;

import Java.Packages.Cwh_04_Access_Modifiers;

class c2 extends Cwh_04_Access_Modifiers{
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
    }
}

public class Cwh_04b_Subclass {
    public static void main(String[] args) {
        // Cwh_04_Access_Modifiers c = new Cwh_04_Access_Modifiers();
        // System.out.println(c.x);
        // in the world only public property can be accessed by importing
        c2 cc = new c2();
        cc.meth2();
        // in a subclass, u can access only the public and protected properties/methods
    }
}


