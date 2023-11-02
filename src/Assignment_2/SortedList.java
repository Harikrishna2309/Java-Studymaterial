package Assignment_2;
import java.util.*;
public class SortedList {
	private ArrayList<Integer>list;
	public SortedList()
	{
		list=new ArrayList<Integer>();
	}
	public boolean isempty() {
		return list.size()==0||list==null;
				}
	public void clear() {
		list=new ArrayList<Integer>();
	}
	public int size() {
		return list.size();
	}
	public void add(int ele) {
		int pos=list.size();
		list.add(ele);
		while(pos>0 && ele<list.get(pos-1)) {
			list.set(pos, list.get(pos-1));
			pos--;
		}
		list.set(pos, ele);
	}
	public void remove(int ind) {
		list.remove(ind);
	}
	public int binarysearch(int ele) {
		return Collections.binarySearch(list,ele);
	}
	public boolean contains(int ele) {
		return binarysearch(ele)>=0;
	}
	public String tostring() {
		return list.toString();
		}
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		SortedList list=new SortedList();
		System.out.println("sorted list test\n");
		char ch;
		do
		{
			System.out.println("\nsorted list operations\n");
			System.out.println("1: insert");
			System.out.println("2: remove");
			System.out.println("3: binary search");
			System.out.println("4: contains");
			System.out.println("5: check empty");
			System.out.println("6: get size");
			System.out.println("7: clear");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter integer element to add ");
				list.add(scan.nextInt());
				break;
			case 2:
				System.out.println("enter index");
				list.remove(scan.nextInt());
				break;
			case 3:
				System.out.println("enter the integer element to search ");
				System.out.println("binary search result: "+list.binarysearch(scan.nextInt()));
				break;
			case 4:
				System.out.println("enter integer element");
				System.out.println("contains relesult: "+list.contains(scan.nextInt()));
				break;
			case 5:
				System.out.println("empty status= "+list.isempty());
				break;
			case 6:
				System.out.println("size= "+list.size()+"\n");
				break;
			case 7:
				System.out.println("sorted list cleared: ");
				list.clear();
				break;
				default:
					System.out.println("wrong entry\n");
			}
			System.out.println(list.tostring());
			System.out.println("\ndo you want to continue(type y or n)\n");
			ch=scan.next().charAt(0);
		}
		while(ch=='Y'||ch=='y');

	}

}
