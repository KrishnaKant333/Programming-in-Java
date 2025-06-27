import java.io.File;
import java.io.IOException;

public class Cwh_01_File_Creation {
    public static void main(String[] args) {
        File myFile = new File("Cwh01File.txt");
        try {
            myFile.createNewFile(); 
        } catch (IOException ex) {
            System.out.println("File creation unsuccessful");
            ex.printStackTrace();
        }
        // it may throw IOException if file creation is not successful
        // so we surround it with try catch
    }
}
