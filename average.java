package Start;
import java.util.Scanner;
public class average {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble();
        System.out.println("Average: " + (a + b + c) / 3);
        s.close();
    }

}
