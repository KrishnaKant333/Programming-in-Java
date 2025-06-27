import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class pr01_05 {
    public static void main(String[] args) {
        File myFile = new File("pr01.txt");
        try {
            myFile.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FileWriter fileWriter;
        String table = "";
        for (int i = 1; i < 11; i++) {
            table += n +"X"+i +" = " + n*i;
            table += "\n";
        }
        try {
            fileWriter = new FileWriter("pr01.txt");
            fileWriter.write("Multiplication table of " + n + " is :\n");
            fileWriter.write(table);
            // for (int i = 1; i <= 10; i++) {
            // fileWriter.write(n+"X"+i+" = "+i*n+"\n");
        // }
        fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }        
        sc.close();
    }
}
