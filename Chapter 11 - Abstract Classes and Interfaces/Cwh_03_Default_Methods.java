interface Camera{
    void takeSnap();
    void recordVideo();
    private void zoom(){
        System.out.println("Zoomed in");
    } // private methods can be used if the logic of the default method is too big, we can put it in this private method and later call it in the default method
    // private methods can not be called directly
    default void recordIn4kVideo(){
        zoom();
        System.out.println("Recording in 4k..");
    } // default methods in an interface need not be overridden in class
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
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

    // public void recordIn4kVideo(){ // default methods can be overridden but not necessarily
    //     System.out.println("Taking snap and recording in 4k..");
    // }
    
    public String[] getNetworks(){
        System.out.println("Getting List of Networks..");
        String[] networkList = {"Harry", "Prasanth", "Divi"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecing to "+ network);
    }    
}

public class Cwh_03_Default_Methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();

        ms.recordIn4kVideo();

        // ms.zoom(); // not allowed

        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);            
        }
    }
}
