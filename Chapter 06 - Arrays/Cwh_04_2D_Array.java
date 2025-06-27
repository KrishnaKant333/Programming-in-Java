import java.util.Scanner;
public class Cwh_04_2D_Array {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // int [] marks; // 1D array
        int [][] flats; // 2D array
        flats = new int[2][3];
        Scanner sc = new Scanner(System.in);

        //taking input in 2D array
        System.out.println("Enter array elements:");

        // Normal for loop
        // for(int i = 0; i<flats.length; i++) {
        //     for(int j = 0; j<flats[i].length; j++){
        //         flats[i][j] = sc.nextInt();
        //     }
        // }
        
        // Enhanced for loop
        for (int[] flat : flats) {
            for (int j = 0; j < flat.length; j++) {
                flat[j] = sc.nextInt();
            }
        }

        sc.close();
        // Displaying 2D array
        System.out.println("Printing 2D array:");

        // Normal for loop
        // for(int i = 0; i<flats.length; i++) {
        //     for(int j = 0; j<flats[i].length; j++){
        //         System.out.print(flats[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // Enhanced for loop
        for (int[] flat : flats) {
            for (int j = 0; j < flat.length; j++) {
                System.out.print(flat[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}