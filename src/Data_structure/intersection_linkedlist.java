package Data_structure;

public class intersection_linkedlist {
	static class node{
		int data;
		node next;
	}
	public static node push(node head,int data) {
		node Node=new node();
		Node.data=data;
		Node.next=head;
		return Node;
	}
	public static node intersectionpoint(node list1,node list2) {
		node firstTemp=list1;
		while(firstTemp!=null) {
			node temp=list2;
			while(temp!=null) {
				if(firstTemp==temp) {
					return firstTemp;
				}
				temp=temp.next;
			}
			firstTemp=firstTemp.next;
		}
		return null;
	}

	public static void main(String[] args) {
		node first=null;
		for(int i=7;i>0;i--) {
			first=push(first,i);
		}
		
		node second=null;
		for(int i=3;i>0;i--) {
			second=push(second,i);
			
		}
		second.next.next.next=first.next.next.next;
		node addr=intersectionpoint(first,second);
		
		if(addr!=null) {
			System.out.println("the intersection point is "+addr.data);
		}else {
			System.out.println("the list do not intersect");
		}

	}

}
