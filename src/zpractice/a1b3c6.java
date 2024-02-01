package zpractice;
import java.util.*;
public class a1b3c6 {

	 public static String decompressString(String s) {
	        StringBuilder result = new StringBuilder();
	        int index = 0;

	        while (index < s.length()) {
	            char currentChar = s.charAt(index);

	            // Check if the character is a letter
	            if (Character.isLetter(currentChar)) {
	                result.append(currentChar);
	                index++;
	            } else {
	                // Otherwise, it must be a digit
	                int count = 0;

	                // Extract the digit count
	                while (index < s.length() && Character.isDigit(s.charAt(index))) {
	                    count = count * 10 + (s.charAt(index) - '0');
	                    index++;
	                }

	                // Append the letter 'count' times to the result
	                for (int i = 0; i < count; i++) {
	                    result.append(currentChar);
	                }
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the compressed string: ");
	        String inputStr = scanner.nextLine();

	        String outputStr = decompressString(inputStr);
	        System.out.println("Input: " + inputStr);
	        System.out.println("Output: " + outputStr);

	        scanner.close();
	    }

}
