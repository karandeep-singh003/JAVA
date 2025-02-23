package Start;
import java.util.Scanner;
public class averagevalue {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter array size:");
	        int n = s.nextInt(), sum = 0;
	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) sum += (arr[i] = s.nextInt());

	        System.out.println("Average: " + (sum / (double) n));
	        s.close();
	    }

}
