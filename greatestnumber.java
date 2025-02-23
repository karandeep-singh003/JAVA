package Start;
import java.util.Scanner;
public class greatestnumber {
	  public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter three numbers:");
	        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();

	        if (a >= b && a >= c) System.out.println("Greatest: " + a);
	        else if (b >= a && b >= c) System.out.println("Greatest: " + b);
	        else System.out.println("Greatest: " + c);
	        
	        s.close();
	    }

}