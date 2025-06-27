package pr01;

class Calculator{
    public int calculate(int a , int b){
        return a+b;
    }
}
class ScCalculator{
    public double calculate(int a , int b){
        return Math.sin(a+b);
    }
}
class HyCalculator{
    public void calculate(int a , int b){
        System.out.println(a+b);
        System.out.println(Math.sin(a+b));
    }
}

public class pr01 {
    public static void main(String[] args) {
        System.out.println("I am the main method");
    }
}
