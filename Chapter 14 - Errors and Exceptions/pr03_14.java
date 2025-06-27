import java.util.Scanner;

class MaxRetryException extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return "Maximum Tries Reached";
    }    
}

public class pr03_14 {
    public static void main(String[] args) {
        int i = 0;
        int marks[] = new int[3];
        marks[0] = 6;
        marks[1] = 56;
        marks[2] = 21;
        Scanner sc = new Scanner(System.in);
        int index;
        while(i<5){
            try {
                System.out.println("Enter the array index:");
                index = sc.nextInt();
                System.out.println("The value at given index is " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Entry");
                i++;
            }
        }
        if (i>=5) {
            try {
                throw new MaxRetryException();
            } catch (MaxRetryException ex) {
                System.out.println(ex);
            }
        }
    }
}
