package Start;
import java.util.TimeZone;
import java.util.Calendar;
public class currentimeGMT {
	public static void main(String[] args) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        System.out.println("Current GMT Time: " + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        System.out.println("Time displayed is in GMT timezone.");
        System.out.println("Bana diya code");
    }
	

}
