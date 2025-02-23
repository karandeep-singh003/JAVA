package Start;
import java.util.Scanner;
public class daysinmonth {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter month number (1-12):");
        int month = s.nextInt();

        int days;
        if (month == 2) days = 28; // Ignoring leap years for simplicity
        else if (month == 4 || month == 6 || month == 9 || month == 11) days = 30;
        else if (month >= 1 && month <= 12) days = 31;
        else {
            System.out.println("Invalid month number!");
            s.close();
            return;
        }
        System.out.println("Days in month: " + days);
        s.close();
    }
}

