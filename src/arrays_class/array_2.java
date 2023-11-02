package arrays_class;

import java.util.Arrays;

public class array_2 {

	public static void main(String[] args) {
		int[] intarray= {1,2,3,4,5};
		String intarrayString=Arrays.toString(intarray);
		System.out.println(intarray);
		for(int val:intarray) {
			System.out.println(val+" ");
		}
		System.out.println("\n"+intarrayString);

	}

}
