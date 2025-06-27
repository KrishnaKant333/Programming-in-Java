
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cwh_06_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // this is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // this is the format
        String myDate = dt.format(df);
        System.out.println(myDate);
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("E -- MM/dd/yyyy H:m a");
        String myDate2 = dt.format(df2);
        System.out.println(myDate2);

        DateTimeFormatter df3 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate3 = dt.format(df3);
        System.out.println(myDate3);        
    }
}
