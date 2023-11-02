package testpractice;
import java.util.*;
public class shopping_bill {
	String id;
	String pname;
	int qty;
	double price,totalprice;
	shopping_bill(String id,String pname,int qty,double price,double totalprice){
		this.id=id;
		this.pname=pname;
		this.price=price;
		this.qty=qty;
		this.totalprice=totalprice;
	}
	public String getid() {
		return id;
	}
	public String getpname() {
		return pname;
	}
	public int qty() {
		return qty;
	}
	public double price() {
		return price;
	}
	public double totalprice() {
		return totalprice;
	}
	public static void displayformat() {
		System.out.format("----------------------------------------------");
		System.out.println("\nProduct ID\t\tName\t\tQuantity		Rate				Totalprice");
		System.out.println("---------------------------------------------");
	}
	public void display(){
		System.out.println("%-9s     %-9s     %5d       %9.2f    %14.2f\n"+id+pname+qty+price+totalprice);
	}

	public static void main(String[] args) {
		String id;
		String productname;
		int qty;
		double price,totalprice,overallprice,cgst,sgst,subtotal,discount;
		char choice;
		

	}

}
