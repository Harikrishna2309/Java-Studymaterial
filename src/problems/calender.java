package problems;
import java.util.Calendar;  
import java.text.SimpleDateFormat;  
import java.text.DateFormat;  
import java.text.DateFormatSymbols;
public class calender {

	public static void main(String[] args) {
		 
		String dayNames[] = new DateFormatSymbols().getWeekdays();  
		Calendar date = Calendar.getInstance();  
		System.out.println("Today is "+ dayNames[date.get(Calendar.DAY_OF_WEEK)]); 
		int a=-5;
		int b=a<<4;
		System.out.println(Integer.toBinaryString(a));
		//System.out.println("b= "+b);
		//String c=Integer.toBinaryString(1073741819);
		//System.out.println(c);
		//System.out.println(Integer.toBinaryString(b));
		//System.out.println(Integer.parseInt(c, 2));
	 
	}

}
