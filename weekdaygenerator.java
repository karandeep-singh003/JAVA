package Start;
import java.util.Scanner;
public class weekdaygenerator {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number (1-7):");
        int num = s.nextInt();

        if (num >= 1 && num <= 7) {
            String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            System.out.println("Weekday: " + days[num - 1]);
        } else {
            System.out.println("Invalid number! Enter between 1 and 7.");
        }

        s.close();
    }

}
