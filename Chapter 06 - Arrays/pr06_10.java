import java.util.Scanner;
public class pr06_10 {
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

        int max = arr[0];
        for(int i = 0; i < n; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element of the array is " + max);
    }
}