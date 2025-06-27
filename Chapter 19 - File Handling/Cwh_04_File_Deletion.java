import java.io.File;

public class Cwh_04_File_Deletion {
    public static void main(String[] args) {
        File myFile = new File("Cwh01File.txt");
        if(myFile.delete()){
            System.out.println("File deletion successful.");
        }
        else{
            System.out.println("Some error occurred while attempting to delete the file.");
        }
    }    
}
