package zpractice;
//import java.time.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class HackerRank {

		    public static String findDay(int month, int day, int year) {
		        LocalDate date = LocalDate.of(year, month, day);
		        DayOfWeek dayOfWeek = date.getDayOfWeek();
		        return dayOfWeek.toString();
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the month: ");
		        int month = scanner.nextInt();
		        System.out.print("Enter the day: ");
		        int day = scanner.nextInt();
		        System.out.print("Enter the year: ");
		        int year = scanner.nextInt();
		        String dayOfWeek = findDay(month, day, year);
		        System.out.println("Day of the week: " + dayOfWeek);
		      
		    
		
		

	}

}

