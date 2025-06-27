
import java.util.HashSet;
import java.util.Scanner;

public class pr02_06 {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your Hash Set :");
        int n = sc.nextInt();
        System.out.println("Enter the values for your Hash Set with duplicates :");
        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }
        
        System.out.println("The Hash Set does not allow repeatations. It will show only the first instance of a repeating number :");
        System.out.println(s);

    }
}