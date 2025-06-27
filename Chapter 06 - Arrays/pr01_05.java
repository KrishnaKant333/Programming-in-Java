import java.util.Scanner;
public class pr01_05 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float []arr = new float[5];
        System.out.println("Enter array elements:");
        for(int i = 0; i<5; i++) {
            arr[i] = sc.nextFloat();
        }
        sc.close();
        float sum = 0;
        for(int j = 0; j<5; j++) {
            sum += arr[j];
        }

        // for(float element : arr) {
        //     sum = sum + element;
        // }
        System.out.println("Sum of array elements: " + sum);
    }
}