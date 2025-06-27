import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }    
}

public class Cwh_07_Exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try {
                throw new MyException();
                // throw new ArithmeticException("I am an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                // System.out.println(e); // e is by default e.toString
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes, Finished");
        }
    }
}
