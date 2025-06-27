import java.util.Scanner;
public class pr05_09 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Given Array :");
        for(int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }

        int t;
        for(int j = 0; j < (n/2); j++) {
            t = arr[j];
            arr[j] = arr[n-j-1];
            arr[n-j-1] = t;
            
        }

        System.out.println("Array in reverse order :");
        for(int element : arr) {
        System.out.println(element);
        }
    }
}