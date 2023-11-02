package Assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class selforganizinglist {
	private ArrayList<Integer>list;
	private ArrayList<Integer>count;
	public selforganizinglist(int n)
	{
		list=new ArrayList<Integer>(n);
		count=new ArrayList<Integer>(n);
	}
	
	public void add(int ele) {
		
		list.add(ele);
		count.add(0);
		
		
	}
	public void search(int ele) {
	if(list.contains(ele)) {
		int index=list.indexOf(ele);
		count.set(index, count.get(index)+1);
		int templist=list.get(index);
		int tempcount=count.get(index);
		for(int i=index;i>0;i--) {
			list.set(i,list.get(i-1));
			count.set(i,count.get(i-1));
			
			}
		list.set(0,templist);
		count.set(0,tempcount);
	}
	else {
		System.out.println("element not present\n");
	}
	}
	public void delete(int pos) {
		list.remove(pos-1);
		count.remove(pos-1);
	}
	public boolean isempty() {
		return list.size()==0;
				}
	public boolean isfull() {
		return list.size()==5;
		
	}
	public int size() {
		return list.size();
	}
	
	public String tostring() {
		return list.toString();
		 
		}
	public String toostring() {
		return count.toString();
	}
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the size ");
		int n=scan.nextInt();
		selforganizinglist list=new selforganizinglist(n);
		System.out.println("sorted list test\n");
		char ch;
		do
		{
			
			System.out.println("1: insert");
			System.out.println("2: search");
			System.out.println("3: delete");
			System.out.println("4: empty status");
			System.out.println("5: full status");
			System.out.println("6: size");
	
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter integer element to add ");
				list.add(scan.nextInt());
				break;
			case 2:
				System.out.println("enter element to search");
				list.search(scan.nextInt());
				break;
			case 3:
				System.out.println("enter the position to delete");
				list.delete(scan.nextInt());
				break;
			case 4:
				System.out.println("empty status= "+list.isempty()+"\n");
				break;
			case 5:
				System.out.println("check full status= "+list.isfull()+"\n");
				break;
			case 6:
				System.out.println("size= "+list.size()+"\n");
				break;
			
				default:
					System.out.println("wrong entry\n");
			}
			System.out.println(list.tostring()+"\n");
			System.out.println(list.toostring()+"\n");
			System.out.println("\ndo you want to continue(type y or n)\n");
			ch=scan.next().charAt(0);
		}
		while(ch=='Y'||ch=='y');

	}

	

}