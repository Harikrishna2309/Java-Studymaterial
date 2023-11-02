package Data_structure;
import java.util.*;
public class Singlilinkedlist {
	 class node{
		int data;
		node next;
		public node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public node head=null;
	public node tail=null;
	public void addnode(int data) {
		node newnode=new node(data);
		
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		else {
			tail.next=newnode;
			tail=newnode;
		}
	}
	public void insertatbeginning(int data) {
		node newnode=new node(data);
		if(head==null) {
		head=newnode;
		tail=newnode;
		}else {
			newnode.next=head;
			head=newnode;
		}
	}
	public void insertatend(int data) {
		node newnode=new node(data);
		if(head==null) {
			head=newnode;
			tail=newnode;
			return;
		}
		tail.next=newnode;
		tail=newnode;
	}
	
	public void display() {
		node current=head;
		if(head==null) {
			System.out.println("list is empty");
			return;
		}else {
			System.out.println("nodes of the singlylinked list: ");
			while(current!=null) {
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println();
			
		}System.out.println("node completed");
	}

	public static void main(String[] args) {
		Singlilinkedlist sl=new Singlilinkedlist();
		int n;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number of elements");
		n=s1.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			sl.addnode(s1.nextInt());
		}
		sl.display();
	  /*sl.display();
		sl.insertatbeginning(5);
		sl.insertatend(10);
		sl.addnode(1);
		sl.addnode(2);
		sl.insertatbeginning(23);
		sl.insertatend(555);
		sl.addnode(3);
		sl.addnode(4);
		sl.insertatbeginning(23);
		sl.insertatend(9);
		sl.display();*/ 

	}

}
