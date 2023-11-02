package oops_practice;
class bankaccount{
	int acc_id;
	String acc_name;
	float amount;
	bankaccount(int id,String name,float amt){
	//void insert(int id,String name,float amt) {
		acc_id=id;
		acc_name=name;
		amount=amt;
	}void display(){
		System.out.print(acc_id+" ");
		System.out.print(acc_name+" ");
		System.out.println(amount+" ");
	}void deposit(float m){
		amount=amount+m;
		System.out.println(m+" deposited");
		
	}void withdraw(float n){
		amount=amount-n;
		System.out.println(n+" withdraw");
	}void checkbalance(){
		System.out.println("Balance is: "+amount);
	}
}
public class bank_details {

	public static void main(String[] args) {
		bankaccount s=new bankaccount(15,"hari",1000);
		//s.insert(15, "hari", 1000);
		s.display();
		s.checkbalance();
		s.deposit(40000);
		s.checkbalance();
		s.withdraw(15000);
		s.checkbalance();

	}

}
