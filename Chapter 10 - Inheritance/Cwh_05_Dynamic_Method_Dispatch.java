class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music");
    }
    public void on(){
        System.out.println("Turning on Smartphone");
    }
}

public class Cwh_05_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone();
        // SmartPhone smobj = new SmartPhone();
        // obj.name();

        Phone obj = new SmartPhone(); // super class ka reference = sub class ka object is allowed but not vice versa
        // SmartPhone obj2 = new Phone(); // not allowed 
        
        obj.showTime(); // reference ka method run ho skta, object ka nhi 
        obj.on(); // object ka method run hoga, reference ka nhi..
        // obj.music(); // not allowed

    }
}
