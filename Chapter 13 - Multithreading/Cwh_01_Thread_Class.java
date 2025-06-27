class MyThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<4000) { 
            System.out.println("My cooking thread is running");
            System.out.println("I am sad");            
            i++;
        }
    }
}


class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("Thread 2 for chatting with her");
            System.out.println("I am happy");
            i++;
        }
    }
}

public class Cwh_01_Thread_Class {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();        
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        // both t1 and t2 run concurrently
    }
}
