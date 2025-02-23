package Start;
import java.util.Scanner;
public class string_operations {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        // 1. Compare two strings
	        System.out.println("Enter two strings:");
	        String str1 = s.nextLine(), str2 = s.nextLine();
	        System.out.println(str1.equals(str2) ? "Strings are equal" : "Strings are not equal");
	        // 2. Count string length
	        System.out.println("Length of first string: " + str1.length());
	        // 3. Convert uppercase to lowercase and vice versa
	        System.out.println("Uppercase: " + str1.toUpperCase());
	        System.out.println("Lowercase: " + str1.toLowerCase());
	        // 4. Concatenate two strings
	        System.out.println("Concatenated String: " + str1 + str2);
	        // 5. Print a substring
	        System.out.println("Enter start and end index for substring:");
	        int start = s.nextInt(), end = s.nextInt();
	        System.out.println("Substring: " + str1.substring(start, end));
	        s.close();
	    }

}
