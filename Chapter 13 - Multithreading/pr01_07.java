class pr01a extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Good morning");
        }
    }
}
class pr01b extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Welcome");
        }
    }
}


public class pr01_07 {
    public static void main(String[] args) {
        pr01a t1 = new pr01a();
        pr01b t2 = new pr01b();
        t1.start();
        // try {
        //     t1.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        t2.start();
    }
}
