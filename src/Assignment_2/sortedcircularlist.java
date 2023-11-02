package Assignment_2;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		next=null;
	}
}
class linkedlist{
	node head;
	linkedlist(){
		head=null;
	}
	void add(node newnode) {
		node current=head;
		if(current==null) {
			head=newnode;
			newnode.next=head;
		}
		else if(current.data>=newnode.data) {
			while(current.next!=head) {
				current=current.next;
			}
			current.next=newnode;
			newnode.next=head;
			head=newnode;
		}
		else {
			
		}
	}
}

public class sortedcircularlist {

	public static void main(String[] args) {
		

	}

}
