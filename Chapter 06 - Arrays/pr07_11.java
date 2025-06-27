import java.util.Scanner;

public class pr07_11 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int min = arr[0];
        for(int i = 0; i < n; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element of the array is " + min);
    }
}
