import java.util.InputMismatchException;
import java.util.Scanner;

class MaxRetryException extends Exception {
    @Override
    public String toString() {
        return getMessage();
    }

    @Override
    public String getMessage() {
        return "Maximum Tries Reached";
    }
}

public class pr04_15 {

    public static void RetryError(int i) throws MaxRetryException {
        if (i == 4) { // 5th attempt
            throw new MaxRetryException();
        } else {
            System.out.println("Invalid Entry");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = {6, 56, 21};
        int index;
        int i = 0;

        while (i < 5) {
            try {
                System.out.println("Enter the array index:");
                index = sc.nextInt();
                System.out.println("The value at the given index is " + marks[index]);
                break;
            } catch (InputMismatchException e) {
                sc.nextLine(); // clear invalid input
                System.out.println("Please enter a valid integer.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of bounds. Valid indices are 0 to 2.");
            } catch (Exception e) {
                System.out.println("Some other error occurred: " + e);
            }

            try {
                RetryError(i);
            } catch (MaxRetryException ex) {
                System.out.println(ex);
                break;
            }
            i++;
        }
        sc.close();
    }
}
