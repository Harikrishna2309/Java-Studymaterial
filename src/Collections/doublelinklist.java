package Collections;

public class doublelinklist {
	int flag=0;
	class node{
		int data;
		public node next;
		public node prev;
		public node (int data) {
			this.data=data;
			next=null;
			prev=null;
		}
	}
	node head=null;
	node tail=null;
	public void addnode(int data) {
		node temp=new node(data);
		if(tail!=null) {
			tail.next=temp;
			temp.prev=tail;
		}tail=temp;
		if(head==null) {
			head=temp;
		}
		System.out.println("new node added: "+data);
	}
	public void iterateforward() {
		System.out.println("forward");
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}System.out.println();
	}
	public void iteratebackward() {
		System.out.println("backward");
		node temp=tail;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}System.out.println();
	}
   public void addnodefront(int data) {
	   node temp=new node(data);
	   if(head!=null) {
		   head.prev=temp;
		   temp.next=head;
	   }head=temp;
	   if(tail==null) {
		   tail=temp;
	   }
	   System.out.println("new node added: "+data);
   }
   public int removenodefront() {
	   node temp=head;
	   head=head.next;
	   head.prev=null;
	   System.out.println("delete: "+temp.data);
	   return temp.data;
   }public int removenodeback() {
	   node temp=tail;
	   tail=tail.prev;
	   tail.next=null;
	   System.out.println("delete: "+temp.data);
	   return temp.data;
   }
   public void removeelement(int data) {
	   node temp=head;
	   
	   if(head.data==data) {
		   head=head.next;
		   head.prev=null;
		   return;
	   }while(temp!=null) {
		   if(temp.data==data && temp.next!=null) {
			   temp.next.prev=temp.prev;
			  temp.prev.next=temp.next;
			   flag=1;
		   }else if(temp.data==data){
			   temp.prev.next=null;
			   tail=temp.prev;
			   flag=1;
		   }
		   temp=temp.next;
	   }if(flag==0) {
		   System.out.println("element is not present");
	   }
   }
	public static void main(String[] args) {
		doublelinklist d1=new doublelinklist();
		d1.addnode(23);
		d1.addnode(9);
		d1.addnode(10);
		d1.addnode(12);
	    d1.addnodefront(100);
		d1.iterateforward();
		d1.iteratebackward();
		d1.iterateforward();
		d1.removenodeback();
		d1.removenodefront();
		d1.iterateforward();
		d1.removeelement(55);
		d1.iterateforward();

	}

}
