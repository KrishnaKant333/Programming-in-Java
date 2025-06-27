class pr01a extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
            // try{
            //     Thread.sleep(200);
            // }
            // catch(InterruptedException e){
            //     e.printStackTrace();
            // }
            System.out.println("Good morning");
        }
    }
}
class pr01b extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Welcome");
        }
    }
}

public class pr02_08 {
    public static void main(String[] args) {
        pr01a t1 = new pr01a();
        pr01b t2 = new pr01b();
        t1.start();
        t2.start();
    }
}
