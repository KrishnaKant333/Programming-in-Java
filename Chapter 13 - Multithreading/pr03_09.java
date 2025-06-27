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

public class pr03_09 {
    public static void main(String[] args) {
        pr01a t1 = new pr01a();
        pr01b t2 = new pr01b();

        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
