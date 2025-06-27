import java.util.Scanner;
public class pr06_13 {
    static float avg(int ...arr) {
        int sum = 0;
        for(int element : arr) {
            sum += element;
        }
        float a = (float)sum/arr.length;
        return a;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter a set of numbers:");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        float average = avg(arr);
        System.out.println("The average of the numbers are : " + average);
    }
}