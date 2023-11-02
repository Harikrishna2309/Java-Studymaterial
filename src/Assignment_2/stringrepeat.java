package Assignment_2;
import java.util.*;
public class stringrepeat {
	public static String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        if (size == 0)
            return "-1";
 
        if (size == 1)
            return "-1";
            
        Arrays.sort(strs);
        
        int end = Math.min(strs[0].length(), strs[size-1].length());
        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[size-1].charAt(i) )
            i++;
 
        String pre = strs[0].substring(0, i);
        return pre;
        
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character after reading the integer 'n'

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = scanner.next();
        }

        String longestPrefix = longestCommonPrefix(strs);
        System.out.println(longestPrefix);
    }
}
