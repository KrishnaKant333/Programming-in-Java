class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        while(i<100){
            System.out.println("Thank you! " + this.getName());
            i++;
        }
    }
}

public class Cwh_04_Thread_Priority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Harry");
        MyThread t2 = new MyThread("Divi (most important)");
        MyThread t3 = new MyThread("Harry2");
        MyThread t4 = new MyThread("Harry3");

        t2.setPriority(Thread.MAX_PRIORITY);
        // t2.setPriority(10); same thing
        t1.setPriority(Thread.NORM_PRIORITY); // norm priority = 5
        t3.setPriority(Thread.MIN_PRIORITY); // min priority = 1

        // priority is also dependent on the OS 
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
