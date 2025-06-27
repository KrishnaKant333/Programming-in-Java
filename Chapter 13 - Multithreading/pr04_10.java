class pr01a extends Thread{
    public void run(){
        // for(int i = 0; i < 100; i++){
            System.out.println("Good morning");
        // }
    }
}
class pr01b extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Welcome");
        }
    }
}

public class pr04_10 {
    public static void main(String[] args) {
        pr01a t1 = new pr01a();
        pr01b t2 = new pr01b();

        System.out.println(t1.getState()); // have not started --> NEW
        t1.start();
        System.out.println(t1.getState()); // after being started --> RUNNABLE
    }
}
