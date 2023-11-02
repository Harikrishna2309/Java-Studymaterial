package Data_structure;
import java.util.*;
public class duplicate_linkedlist {
	static class node{
		int data;
		node next;
	}
	static node head_ref;
	public static void push(int data) {
		node new_node=new node();
		node last=head_ref;
		new_node.data=data;
		new_node.next=null;
		if(head_ref==null) {
			head_ref=new_node;
			return;
		}while(last.next !=null)
			last=last.next;
		last.next=new_node;
		return;
	}
	public static int duplicate(node Node) {
		HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();
		node head=Node;
		while(Node!=null) {
			if(mp.containsKey(Node.data))
				mp.put(Node.data,mp.get(Node.data)+1);
			else
				mp.put(Node.data,1);
			Node=Node.next;
		}
		Node=head;
		while(Node!=null) {
			if(mp.get(Node.data)>1)
				return Node.data;
			Node=Node.next;
		}
		return -1;
	}

	public static void main(String[] args) {
		head_ref=null;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number of items in the list");
		int n=s1.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			push(s1.nextInt());
		}
		int result=duplicate(head_ref);
		if(result==-1){
			System.out.println("no duplicate");
		}
		else {
			System.out.println("first duplicate element is: "+result);
		}
			

	}

}
