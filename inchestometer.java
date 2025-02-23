package Start;
import java.util.Scanner;
public class inchestometer {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Meters: " + (s.nextDouble() * 0.0254));
	        s.close();
	    }
}
