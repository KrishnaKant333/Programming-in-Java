class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println("I am a thread");
        }
    }
}

public class Cwh_03_Constructors_in_Thread{
    public static void main(String[] args) {
        MyThread t = new MyThread("Harry");
        t.start();
        // System.out.println("The id of the thread t is "+ t.getId());
        // getId is deprecated, use threadId
        System.out.println("The id of the thread t is "+ t.threadId());
        System.out.println("The name of the thread t is "+ t.getName());
    }
}
