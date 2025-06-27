
import java.util.Date;

public class Cwh_02_Date {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime()); // returns current time in ms from 1 jan 1970
        // System.out.println(d.getDate()); // deprecated 
        // System.out.println(d.getYear()); // deprecated 
        // year is calculated from 1900
    }
}
