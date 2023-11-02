package Data_structure;

public class circularLinkedlist {
	int flag=0;
	public class node{
		int data;
		node next;
		public node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public node head=null;
	public node tail=null;
	public void add(int data) {
        node newnode=new node(data);
		
		if(head==null) {
			head=newnode;
			tail=newnode;
			newnode.next=head;
			return;
		}
		else {
			tail.next=newnode;
			tail=newnode;
			tail.next=head;
		}
	}
	public void insertatBeginnings(int data) {
		 node temp=new node(data);
		 if(head==null) {
				head=temp;
				tail=temp;
				tail.next=head;
				return;
			}
		 else {
			 tail.next=temp;
				//head=temp;
				temp.next=head;
				head=temp;
				}  
	}
    public void addafter(int data1,int item) {
    	node newnode=new node(data1);
		node current=head;
		if(head==null) {
			head=newnode;
			tail=newnode;
			tail.next=head;
			return;
		}
		else {
			do {
				if(current.data==item) {
					if(current==tail) {
						tail.next=newnode;
						tail=newnode;
						tail.next=head;
						current=newnode;
					}
					else {
						newnode.next=current.next;
						current.next=newnode;
						current=newnode;
					}
				}
				current=current.next;
			}while(current!=head);
		}
	}
	public void display() {
		node current=head;
		if(head==null) {
			System.out.println("list is empty");

		}
		else {
			System.out.println("nodes of the circular node are: ");
			do {
				System.out.print(" "+current.data);
				current=current.next;
			}while(current!=head);
			System.out.println();
		}
	}
	
	public void insertatEnd(int data) {
		node temp=new node(data);
		if(head==null) {
			head=temp;
			tail=temp;
			tail.next=head;
			return;
		}else {
			tail.next=temp;
			tail=temp;
			tail.next=head;
		}
		
	}
	public void deletenode(int data1) {
		node newnode=new node(data1);
		
		node current=head;
		if (head==null) {
			System.out.println("list is empty");
			return;
		}
		do {
			if(current==head && current.data==data1) {
				newnode=head.next;
				tail.next=newnode;
				head=newnode;
				flag=1;
			}else if(current.next.data==data1){
				newnode=current.next;
				current.next=newnode.next;
				flag=1;
			}
			current=current.next;
		}while(current!=head);
		if(flag==0) {
			System.out.println("element is not present");
		}
		
		
		
	}
	

	public static void main(String[] args) {
		circularLinkedlist c1=new circularLinkedlist();
		c1.add(23);
		c1.add(9);
		c1.add(10);
		c1.add(12);
		c1.insertatBeginnings(5);
		c1.display();
		c1.insertatEnd(66);
		c1.display();
		c1.addafter(55,5);
		c1.display();
		c1.deletenode(5);
		c1.display();

	}

}
