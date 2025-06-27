
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class pr03_09 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        // ISO LOCAL TIME will give time upto nano second
        String hms = dt.format(df);
        System.out.println(hms);
    }
}
