interface Camera{
    void takeSnap();
    void recordVideo();
    private void zoom(){
        System.out.println("Zoomed in");
    }
    default void recordIn4kVideo(){
        zoom();
        System.out.println("Recording in 4k..");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber + "...");
    }

    void pickCall(){
        System.out.println("Connecting..");
    }
}

class MySmartPhone extends MyCellPhone implements Wifi, Camera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }

    public void recordVideo(){
        System.out.println("Recoding Video");
    }
    
    public String[] getNetworks(){
        System.out.println("Getting List of Networks..");
        String[] networkList = {"Harry", "Prasanth", "Divi"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecing to "+ network);
    }    
}



public class Cwh_05_Polymorphism_in_Interfaces {
    public static void main(String[] args) {
        Camera cam1 = new MySmartPhone(); // obj smartphone hi h lekin use camera jaise kro bas
        // cam1.getnetworks(); // not allowed as reference is of camera so wifi methods can not be implemented        
        System.out.println("When reference is of camera:");
        cam1.recordIn4kVideo(); // camera ka method h obv chalega

        // if full access is required, make reference of smartphone itself
        System.out.println("When reference is of smartphone:");
        MySmartPhone msp = new MySmartPhone();
        msp.recordVideo();
        msp.callNumber(100);
        String[] ar = msp.getNetworks(); 
        for (String item : ar) {
            System.out.println(item);
        }
        // ab saare methods use kr skte ho  
    }
}
