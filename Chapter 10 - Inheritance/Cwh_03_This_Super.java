class EkClass{
    int a;

    public int getA(){
        return a;
    }

    EkClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("Mai ek constructor hun");
        System.out.println(a + c);
    }
}

public class Cwh_03_This_Super {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(d.getA());
    }   
}
