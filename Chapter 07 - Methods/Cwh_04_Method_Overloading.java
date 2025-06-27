public class Cwh_04_Method_Overloading {
    static void foo() {
        System.out.println("Good morning Bro!");
    }
    static void foo(int a) {
        System.out.println("Good morning " + a + " Bro!");
    }
    public static void main(String[] args) {
        foo();
        foo(3000);
    }
} 
// method overloading cannot be changed by changing return type but keeping the arguments same of methods 