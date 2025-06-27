import java.util.Scanner;
public class pr08_12 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int a = 0, d = 0;
        for(int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]) {
                d++;
            }
            else if(arr[i]<arr[i+1]) {
                a++;
            }
        }
        if(a==n-1) {
            System.out.println("Array is sorted in ascending order");
        }
        else if(d==n-1) {
            System.out.println("Array is sorted in descending order");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }
}