package Start;
import java.util.Scanner;
public class smallestnumber {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter three numbers:");
	        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
	        System.out.println("Smallest: " + Math.min(a, Math.min(b, c)));
	        s.close();
	    }

	}
