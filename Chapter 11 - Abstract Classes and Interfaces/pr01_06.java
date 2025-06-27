abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Writing..");
    }
    void refill(){
        System.out.println("Refilling..");
    }
    void changeNib(){
        System.out.println("Changing the nib..");
    }
}

public class pr01_06 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
    }    
}
