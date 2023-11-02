package Collections;
import java.util.Scanner;
class node21{
	protected int data;
	protected node21 next,prev;
	public node21() {
		next=null;
		prev=null;
		data=0;
	}
	public node21(int d,node21 n,node21 p) {
		data=d;
		next=n;
		prev=p;
	}
	public node21 setlinknext(node21 n) {
		return next=n;
	}
	public void setlinkprev(node21 p) {
		prev=p;
	}
	public node21 getlinknext() {
		return next;
	}
	public node21 getlinkprev() {
		return prev;
	}
	public void setdata(int d) {
		data=d;
	}
	public int getdata() {
		return data;
	}
}
class linkedlist{
	protected node21 start;
	public int size;
	public linkedlist() {
		start=null;
		size=0;
	}
	public boolean isempty() {
		return start==null;
	}
	public int getsize() {
		return size;
	}
	public void insert(int val) {
		node21 nptr=new node21(val,null,null);
		node21 tmp,ptr;
		boolean ins=false;
		if(start==null)
			start=nptr;
		else if(val<=start.getdata()) {
			nptr.setlinknext(start);
			start.setlinknext(nptr);
			start=nptr;
			
		}
		else {
			tmp=start;
			ptr=start.getlinknext();
			while(ptr!=null) {
				if(val>=tmp.getdata()&& val<=ptr.getdata()) {
					tmp.setlinknext(nptr);
					nptr.setlinkprev(tmp);
					nptr.setlinknext(ptr);
					ptr.setlinkprev(nptr);
					ins=true;
					break;
				}
				else {
					tmp=ptr;
					ptr=ptr.getlinknext();
				}
			}
			if(!ins) {
				tmp.setlinknext(nptr);
				nptr.setlinkprev(tmp);
				
			}
		}
		size++;
	}
	public void deleteatpos(int pos) {
		if(pos==1) {
			if(size==1) {
				start=null;
				size=0;
				return;
			}
			start=start.getlinknext();
			start.setlinkprev(null);
			size--;
			return;
		}
		if(pos==size) {
			node21 ptr =start;
			for(int i=1;i<size-1;i++)
				ptr=ptr.setlinknext(null);
			ptr.setlinknext(null);
			size--;
			return;
			
		}
		node21 ptr=start.getlinknext();
		for(int i=2;i<=size;i++) {
			if(i==pos) {
				node21 p=ptr.getlinkprev();
				node21 n=ptr.getlinknext();
				p.setlinknext(n);
				p.setlinknext(p);
				size--;
				return;
			}
			ptr=ptr.getlinknext();
		}
	}
	public void display() {
		System.out.println("doubly linked list= ");
		if(size==0) {
			System.out.println("empty\n");
			return;
		}
		if(start.getlinknext()==null) {
			System.out.println(start.getdata());
			return;
		}
		node21 ptr=start;
		System.out.print(start.getdata()+"<->");
		ptr=start.getlinknext();
		while(ptr.getlinknext()!=null) {
			System.out.print(ptr.getdata()+"<->");
			ptr=ptr.getlinknext();
		}
		System.out.print(ptr.getdata()+"\n");
	}
}
public class sorteddoublylinkedlist {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		linkedlist list=new linkedlist();
		System.out.println("sorted doubly linked list test\n");
		char ch;
		do {
			System.out.println("\nsorted doubly linked list operations ");
			System.out.println("1: insert");
			System.out.println("2: delete at position");
			System.out.println("3: check empty");
			System.out.println("4: get size");
			int choice=scan.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("enter the integer to insert");
				list.insert(scan.nextInt());
				break;
			case 2:
				System.out.println("enter position");
				int p=scan.nextInt();
				if(p<1 || p>list.getsize())
					System.out.println("invalid position");
				else
					list.deleteatpos(p);
				break;
			case 3:
				System.out.println("empty status= "+list.isempty()+"\n");
				break;
			case 4:
				System.out.println("size= "+list.getsize()+"\n");
				break;
				default:
					System.out.println("wrong entry");
					break;
			
			}
			list.display();
			System.out.println("\ndo you want to continue(type y or n");
			ch=scan.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		

	}

}
