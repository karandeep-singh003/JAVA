package Start;
import java.util.Scanner;
public class arrayindexfinder {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter array size:");
	        int n = s.nextInt(), arr[] = new int[n];

	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) arr[i] = s.nextInt();

	        System.out.println("Enter number to find index:");
	        int target = s.nextInt(), index = -1;

	        for (int i = 0; i < n; i++) if (arr[i] == target) { index = i; break; }

	        System.out.println(index != -1 ? "Index: " + index : "Not found");
	        s.close();
	    }
}
