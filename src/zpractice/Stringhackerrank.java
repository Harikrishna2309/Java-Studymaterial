package zpractice;
import java.util.Scanner;

public class Stringhackerrank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two strings
        String string1 = scanner.next();
        String string2 = scanner.next();
        
        // Sum of the lengths of the strings
        int sumOfLengths = string1.length() + string2.length();
        System.out.println(sumOfLengths);
        
        // Check if string1 is lexicographically greater than string2
        String lexicographicalOrder = string1.compareTo(string2) > 0 ? "Yes" : "No";
        System.out.println(lexicographicalOrder);
        
        // Capitalize the first letter in both strings
        String capitalizedString1 = string1.substring(0, 1).toUpperCase() + string1.substring(1);
        String capitalizedString2 = string2.substring(0, 1).toUpperCase() + string2.substring(1);
        System.out.println(capitalizedString1 + "\n" + capitalizedString2);
        
        scanner.close();
    }
}
