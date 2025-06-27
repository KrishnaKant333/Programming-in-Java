class MyThread1 extends Thread{
    public void run(){
        int i = 34;
        while(i<100){
            System.out.println("Thank You!");
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

public class Cwh_05_Thread_Join{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}