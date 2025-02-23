package Start;
import java.util.Scanner;
public class area_computing {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        
	        System.out.println("Circle Area: " + (Math.PI * s.nextDouble() * s.nextDouble()));
	        System.out.println("Rectangle Area: " + (s.nextDouble() * s.nextDouble()));
	        System.out.println("Triangle Area: " + (0.5 * s.nextDouble() * s.nextDouble()));
	        System.out.println("Square Area: " + (s.nextDouble() * s.nextDouble()));
	        
	        s.close();
	    }
	}
