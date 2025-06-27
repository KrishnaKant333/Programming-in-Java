class MyThread1 extends Thread{
    public void run(){
        int i = 34;
        while(i<100){
            System.out.println("Thank You!");
            try {
                Thread.sleep(455);                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 45;
        while(i<100){
            System.out.println("Welcome!");
            i++;
        }
    }
}


public class Cwh_06_Thread_Sleep {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        try {
            t1.join();            
        } catch (Exception e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
