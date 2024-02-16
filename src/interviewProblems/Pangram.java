package interviewProblems;
import java.util.*;
public class Pangram {
	public static int isPangram(String s) {
        s = s.toLowerCase().replaceAll("[^a-z]", "");
        boolean[] alphabetPresent = new boolean[26];
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            alphabetPresent[index] = true;
        }
        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return 0;
            }
        }

        return 1; 
  }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < T; i++) {
            String testString = scanner.nextLine();
            System.out.println(isPangram(testString));
        }

        
    }
	
}

