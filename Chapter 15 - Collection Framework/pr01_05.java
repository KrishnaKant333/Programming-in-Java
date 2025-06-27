import java.util.ArrayList;
import java.util.Scanner;

public class pr01_05 {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        System.out.println("Enter the names of 10 students:");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            String name = sc.nextLine();
            ar.add(name);
        }

        sc.close();

        System.out.println("Total students: " + ar.size());
        System.out.println("The names of the 10 students entered are:");
        for (String name : ar) {
            System.out.println(name);
        }
    }
}
