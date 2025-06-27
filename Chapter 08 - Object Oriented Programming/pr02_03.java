class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }

    public void callFriend(){
        System.out.println("Calling Dv...");
    }
}

public class pr02_03 {
    public static void main(String[] args) {
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();
    }
}
