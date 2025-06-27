abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelePhone extends TelePhone{
    void ring(){
        System.out.println("Ringing..");
    }
    void lift(){
        System.out.println("Lift the phone");
    }
    void disconnect(){
        System.out.println("Disconnect the phone");
    }
    void takeSelfie(){
        System.out.println("Taking selfie..");
    }
}

public class pr04_08 {
    public static void main(String[] args) {
        TelePhone t = new SmartTelePhone();
        t.ring();
        t.lift();;
        t.disconnect();
        // t.takeSelfie(); // not allowed
    }
}
