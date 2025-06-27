import java.util.Scanner;
public class pr03_07 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PHYSICS MARKS OF STUDENTS");
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter marks of Student " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        float avg;
        for(int element : arr) {
            sum += element;
        }
        avg = (float)sum/n;
        System.out.println("The average marks of Students in Physics = " + avg);

    }
}