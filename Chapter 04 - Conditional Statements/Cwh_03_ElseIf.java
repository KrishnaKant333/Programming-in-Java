import java.util.Scanner;
public class Cwh_03_ElseIf {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        if(age>60){
            System.out.println("You are experienced!");
        }
        else if(age>50){
            System.out.println("You are semi-experienced!");
        }
        else if(age>40){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }
    }
}
