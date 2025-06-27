
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cwh_03_File_Reading {
    public static void main(String[] args) {
        File myFile = new File("Cwh01File.txt");
        System.out.println("Reading from a file: ");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println("\""+line+"\"");
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
