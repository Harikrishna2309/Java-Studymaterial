 package zpractice;
import java.util.*;
public class Ibm_prblm {
	public static boolean hasRepeatedDigits(int number) {
        Set<Character> digitSet = new HashSet<>();
        char[] digits = String.valueOf(number).toCharArray();
        for (char digit : digits) {
            if (!digitSet.add(digit)) {
                return true; // Repeated digit found
            }
        }
        return false; // No repeated digits
    }
	public static int countNumbersWithoutRepeatedDigits(int start, int end) {
        int count = 0;
        for (int num = start; num <= end; num++) {
            if (!hasRepeatedDigits(num)) {
                count++;
            }
        }
        return count;
    }

	public static void main(String[] args) {
		int n,m;
		Scanner s1=new Scanner (System.in);
		System.out.println("times");
		int times=s1.nextInt();
		for(int t=0;t<times;t++) {
			System.out.println("enter n");
			n=s1.nextInt();
			System.out.println("enter m");
			m=s1.nextInt();
			ArrayList<Integer> arr=new ArrayList<Integer>();
			for(int i=n;i<=m;i++) {
				arr.add(i);
			}
			
			Ibm_prblm z=new Ibm_prblm();
			int count=countNumbersWithoutRepeatedDigits(n,m);
			System.out.println("count= "+count);
		}
		

	}

}
