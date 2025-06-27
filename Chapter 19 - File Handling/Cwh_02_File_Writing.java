import java.io.FileWriter;
import java.io.IOException;

public class Cwh_02_File_Writing {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("Cwh01File.txt");
            fileWriter.write("This is our first file from this java course.\nOkay now bye.");
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
