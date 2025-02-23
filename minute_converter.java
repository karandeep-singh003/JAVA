package Start;
import java.util.Scanner;
public class minute_converter {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long min = s.nextLong();
        System.out.println("Years: " + (min / 525600) + ", Days: " + ((min % 525600) / 1440));
        s.close();
    }
}
