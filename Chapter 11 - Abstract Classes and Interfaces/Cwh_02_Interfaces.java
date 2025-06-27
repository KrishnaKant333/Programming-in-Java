interface Bicycle{
    int a = 45;
    void applyBrakes(int dec);
    void speedUp(int inc);
}

interface HornBicycle{
    public int x = 50; // interfaces properties are final 
    void blowHornk3g(); // interfaces methods are public by default
    void blowHornmhn();
}
// interfaces ka reference -- allowed, object -- not allowed
class AvonCycle implements Bicycle, HornBicycle{
    public int x = 5;// this way interface properties can be overridden
    void blowHorn(){
        System.out.println("Pee pee po po");
    } 
    public void applyBrakes(int dec){
        System.out.println("Applying brakes");
    }
    public void speedUp(int inc){
        System.out.println("Applying Speedup");
    }

    public void blowHornk3g(){
        System.out.println("Kabhi khushi kabhi gum peee peee peee");
    }
    public void blowHornmhn(){
        System.out.println("Mai hoon na po po po");
    }
}
// class implementing an interface needs to define the methods but not necessarily the fields
public class Cwh_02_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrakes(1);

        // you can create properties in an interface
        System.out.println(cycle.a);

        // you can not modify properties of an interface
        // cycle.a = 456; // not allowed

        cycle.blowHornk3g();
        cycle.blowHornmhn();

        System.out.println(cycle.x);
    }
}


// interface ek se jyada use kr skte ek class ko implement krne k liye
// abstract class ek se jyada nhi use kr skte inherit krne k liye 
// as multiple inheritance is not allowed in java