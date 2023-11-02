package Assignment_2;
import java.util.*;
import java.util.NoSuchElementException;

public class ArrayQueue {
	protected int queue[];
	protected int front,rear,size,len;
	public ArrayQueue(int n) {
		size=n;
		len=0;
		queue=new int [size];
		front=-1;
		rear=-1;
	}
	public boolean isempty() {
		return front==-1;
	}
	public boolean isfull() {
		return front==0&&rear==size-1;
	}
	public int getsize() {
		return len;
	}
	public int peek() {
		if(isempty())
			throw new NoSuchElementException("underflow exception");
		return queue[front];
	}
	public void insert(int i) {
		if(rear==-1) {
			front=0;
			rear=0;
			queue[rear]=i;
		}
		else if(rear+1>=size)
			throw new IndexOutOfBoundsException("overflow exception");
		else if(rear+1<size)
			queue[++rear]=i;
		len++;
	}
	public int remove() {
		if (isempty())
			throw new NoSuchElementException("underflow exception");
		else {
			len--;
			int ele=queue[front];
			if(front==rear) {
				front=-1;
				rear=-1;
				
			}
			else
				front++;
			return ele;
		}
	}
	public void display() {
		System.out.print("\nqueue=");
		if(len==0) {
			System.out.print("empty\n");
			return;
		}
		for(int i=front;i<=rear;i++) {
			System.out.print(queue[i]+" ");	
		}System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("array queue test\n");
		System.out.println("enter the size of the queue");
		int n=scan.nextInt();
		ArrayQueue q= new ArrayQueue(n);
		char ch;
		do {
			System.out.println("\nqueue operations");
			System.out.println("1.insert");
			System.out.println("2.remove");
			System.out.println("3.peek");
			System.out.println("4.check empty");
			System.out.println("5.check full");
			System.out.println("6.size");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the element to insert");
				try {
					q.insert(scan.nextInt());
				}
				catch(Exception e) {
					System.out.println("error: "+e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("removed element= "+q.remove());
				}
				catch(Exception e) {
					System.out.println("error: "+e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("peek element= "+q.peek());
				}
				catch(Exception e) {
					System.out.println("error: "+e.getMessage());
				}
				break;
			case 4:
				System.out.println("empty status="+q.isempty());
				break;
			case 5:
				System.out.println("full status="+q.isfull());
				break;
			case 6:
				System.out.println("size="+q.getsize());
				break;
			default :
					System.out.println("wrong entry\n");
					break;
			}
			q.display();
			System.out.println("\ndo you want to continue(type y or n\n");
			ch=scan.next().charAt(0);
		}
		while(ch=='Y'||ch=='y');
				

	}

}
