
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class pr02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The multiplication table should start from the number : ");
        int p = sc.nextInt();
        System.out.println("The multiplication table should end at the number : ");
        int q = sc.nextInt();
        int n;
        for (n = p; n <= q; n++) {
            File myFile = new File("D:\\VS Code\\Java\\Chapter 19 - File Handling\\pr02\\" + n + ".txt");
            try {
                myFile.createNewFile();
                FileWriter fileWriter = new FileWriter(
                        "D:\\VS Code\\Java\\Chapter 19 - File Handling\\pr02\\" + n + ".txt");
                fileWriter.write("Multiplication table of " + n + " is :\n");
                for (int i = 1; i < 11; i++) {
                    fileWriter.write(n + "X" + i + " = " + n * i + "\n");
                }
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }
}