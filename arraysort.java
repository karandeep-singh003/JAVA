package Start;
import java.util.Arrays;
import java.util.Scanner;
public class arraysort {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter size of numeric array:");
	        int n = s.nextInt();
	        int[] numbers = new int[n];
	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) numbers[i] = s.nextInt();
	        Arrays.sort(numbers);
	        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
	        System.out.println("Enter size of string array:");
	        int m = s.nextInt();
	        String[] words = new String[m];
	        System.out.println("Enter " + m + " words:");
	        for (int i = 0; i < m; i++) words[i] = s.next();
	        Arrays.sort(words);
	        System.out.println("Sorted Words: " + Arrays.toString(words));
	        s.close();
	    }

}
