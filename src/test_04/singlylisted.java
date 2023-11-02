package test_04;
import java.util.*;
public class singlylisted {
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
	public void deletenode(int data1) {
		node current=head;
		
		if(current.data==data1) {
			current.next=current.next.next;
			
		}while(current.data!=data1) {
		System.out.println(current.data+" ");
		break;
		}
		current=current.next;
		
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
				
		}
	}


	public static void main(String[] args) {
		singlylisted sl=new singlylisted();
		
		sl.display();
		sl.addnode(10);
		sl.addnode(20);
		sl.insertatend(100);
		sl.addnode(30);
		sl.addnode(40);
		sl.insertatbeginning(1000);
		sl.insertatbeginning(2000);
		sl.deletenode(10);
		sl.display();

	}

}
