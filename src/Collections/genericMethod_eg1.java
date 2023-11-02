package Collections;
import java.util.*;
public class genericMethod_eg1 {
	public static<e>void printarray(e[]elements){
		for(e element:elements) {
			System.out.print(element+" ");
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[]intarray= {10,12,23,9};
		Character[]chararray= {'h','a','r','i'};
		System.out.println("printing integer array: ");
		printarray(intarray);
		System.out.println("printing charcter array");
		printarray(chararray);
		
		

	}

}
