import java.util.Scanner;
public class Cwh_05_Specific_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 52;
        marks[2] = 27;

        System.out.println("Enter the array index:");
        int n = sc.nextInt();

        System.out.println("Enter the number you want to divide with:");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is " + marks[n] +".");
            System.out.println("The value when array-value/number is " + marks[n]/number +".");
        }
        //  catch (Exception e) {
        //     System.out.println("Some exception occurred!"); //--> not being specifc
        //     System.out.println(e);
        // }

        // better catch block: 

        catch(ArithmeticException e){
            System.out.println("Some arithemetic exceptiopn occurred. Please enter valid arguments! Exception encoutered :");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The array index you are trying to enter is most likely invalid. Please enter a valid index! Exception encountered:");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other exception occured :");
            System.out.println(e);
        }


    }
}
