import java.util.Scanner;

public class Cwh_06_Nested_Try_Catch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 52;
        marks[2] = 27;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag){
            System.out.println("Enter array index:");
            int ind = sc.nextInt();
            try {
                System.out.println("Processing the value at the entered index..");
                try {
                    System.out.println(marks[ind]);         
                    flag = false;       
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");            
            }
        }
        System.out.println("Thanks for using this program");
    }
}
