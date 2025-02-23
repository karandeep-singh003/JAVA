package Start;
import java.util.Scanner;
public class specific_value {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter array size:");
	        int n = s.nextInt(), arr[] = new int[n];

	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) arr[i] = s.nextInt();

	        System.out.println("Enter number to search:");
	        int target = s.nextInt(), found = 0;

	        for (int num : arr) if (num == target) found = 1;

	        System.out.println(found == 1 ? "Exists in array" : "Not in array");
	        s.close();
	    }

}
