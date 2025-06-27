
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@FunctionalInterface // this means the interface contains only one abstract method
interface myFunctionalInterface{
    void thisMethod();
    // void thisMethod2(); // error
}

class Phone{
    public void showTime(){
        System.out.println("The time is 2 PM");
    }
}

class SmartPhone extends Phone{
    @Override // override annotation so as to confirm that the programmer is actually overriding a method from parent class or not.
    public void showTime(){
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        System.out.println("The time is " + dt.format(df));
    }
}

class test{
    @Deprecated // deprecated will not let the compiler compile the deprecated methd and give a warning.
    public int sum(int a, int b){
        return a+b;
    }
}

public class Cwh_01_Annotations {
    @SuppressWarnings(" deprecation ") // to supress any warnings
    public static void main(String[] args) {
        test t = new test();
        t.sum(5,7);
        SmartPhone phone = new SmartPhone();
        phone.showTime();
    }
}
