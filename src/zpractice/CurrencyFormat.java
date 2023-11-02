package zpractice;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;
import java.util.Scanner;
public class CurrencyFormat {
	
	    public static void main(String[] args) {
	        Scanner s1=new Scanner(System.in);
	        System.out.println("enter the number");
	        double number = s1.nextDouble();
	        // Create locales for different currencies
	       
	        Locale chinaLocale = Locale.CHINA;
	        Locale franceLocale = Locale.FRANCE;
	        Locale usLocale=Locale.US;
	        Locale indiaLocale=new Locale("en","IN");
	        
	     // Locale usLocale = new Locale("en", "US");
	     // Locale indiaLocale = new Locale("en", "IN");
	        

	        // Create currency formatters for each locale
	        NumberFormat usCurrencyFormatter = NumberFormat.getCurrencyInstance(usLocale);
	        NumberFormat indiaCurrencyFormatter = NumberFormat.getCurrencyInstance(indiaLocale);
	        NumberFormat chinaCurrencyFormatter = NumberFormat.getCurrencyInstance(chinaLocale);
	        NumberFormat franceCurrencyFormatter = NumberFormat.getCurrencyInstance(franceLocale);
	        
	    

	        // Format the number for different currencies
	        String usCurrency = usCurrencyFormatter.format(number);
	        String indiaCurrency = indiaCurrencyFormatter.format(number);
	        String chinaCurrency = chinaCurrencyFormatter.format(number);
	        String franceCurrency = franceCurrencyFormatter.format(number);

	        // Print the formatted currencies
	        System.out.println("US: " + usCurrency);
	        System.out.println("India: " + indiaCurrency);
	        System.out.println("China: " + chinaCurrency);
	        System.out.println("France: " + franceCurrency);
	    }
	

}
