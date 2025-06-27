class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }

    public void run(){
        System.out.println("Running from the enemy");
    }

    public void fire(){
        System.out.println("Firing at the enemy");
    }
}

public class pr05_06 {
    public static void main(String[] args) {
        TommyVecetti tm = new TommyVecetti();
        tm.hit();    
        tm.fire();
        tm.run();
    }    
}
