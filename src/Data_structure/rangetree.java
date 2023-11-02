package Data_structure;
import java.util.Scanner;
import java.util.Random;
class bstnode{
	bstnode left,right;
	int data;
	public bstnode() {
		left=null;
		right=null;
		data=0;
	}
	public bstnode(int n) {
		left=null;
		right=null;
		data=n;
	}
	public void setleft(bstnode n) {
		left=n;
	}
	public void setright(bstnode n) {
		right=n;
	}
	public bstnode getleft() {
		return left;
	}
	public bstnode getright() {
		return right;
	}
	public void setdata(int d) {
		data=d;
	}
	public int getdata() {
		return data;
	}
	
}
public class rangetree {
	private bstnode root;
	public rangetree() {
		root=null;
	}
	public boolean isempty() {
		return root==null;
	}
	public void insert(int data) {
		root=insert(root,data);
	}
	private bstnode insert(bstnode node,int data) {
		if(node==null) {
			node=new bstnode(data);
		}
		else {
			if(data<=node.getdata())
				node.left=insert(node.left,data);
			else
				node.right=insert(node.right,data);
		}
		return node;
	}
	public void delete(int k) {
		if(isempty()) {
			System.out.println("tree empty");
		}
		else if(search(k)==false){
			System.out.println("sorry "+k+" is not present");
		}
		else {
			root=delete(root,k);
			System.out.println(k+" deleted from the tree");
		}
	}
	private bstnode delete(bstnode root,int k) {
		bstnode p,p2,n;
		if(root.getdata()==k) {
			bstnode lt,rt;
			lt=root.getleft();
			rt=root.getright();
			if(lt==null && rt==null)
				return null;
			else if(lt==null) {
				p=rt;
				return p;
			}
			else if(rt==null) {
				p=lt;
				return p;
			}else {
				p2=rt;
				p=rt;
				while(p.getleft()!=null) {
					p=p.getleft();	
				}
				p.setleft(lt);
				return p2;
			}
		}
		if(k<root.getdata()) {
			n=delete(root.getleft(),k);
			root.setleft(n);
		}else {
			n=delete(root.getright(),k);
			root.setright(n);
		}
		return root;
			
	}
	public int countnodes() {
		return countnodes(root);
	}
	private int countnodes(bstnode r) {
		if(r==null)
			return 0;
		else {
			int l=1;
			l+=countnodes(r.getleft());
			l+=countnodes(r.getright());
			return l;
		}
	}
	public boolean search(int val) {
		return search(root,val);
	}
	private boolean search(bstnode r,int val) {
		boolean found =false;
		while((r!=null)&& !found) {
			int rval=r.getdata();
			if(val<rval)
				r=r.getleft();
			else if(val>rval)
				r=r.getright();
			else {
				found=true;
				break;
			}
			found= search(r,val);
		}
		return found;
	}
	public void inorder() {
		inorder(root);
	}
	private void inorder(bstnode r) {
		if(r!=null) {
			inorder(r.getleft());
			System.out.print(r.getdata()+" ");
			inorder(r.getright());
		}
	}
	public void preorder() {
		preorder(root);
	}
	private void preorder(bstnode r) {
		if(r!=null) {
			System.out.print(r.getdata()+" ");
			preorder(r.getleft());
			preorder(r.getright());
		}
	}
	public void postorder() {
		postorder(root);
	}
	private void postorder(bstnode r) {
		if(r!=null) {
			postorder(r.getleft());
			postorder(r.getright());
			System.out.print(r.getdata()+" ");
			
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		rangetree bst=new rangetree();
		System.out.println("range tree in one dimensional points\n");
		Random random=new Random();
		int n=10;
		for(int i=0;i<n;i++) {
			bst.insert(Math.abs(random.nextInt(10)));
		}
		char ch;
		do {
			System.out.print("operations\n");
			System.out.println("1.print tree");
			System.out.println("2.delete");
			System.out.println("3.search");
			System.out.println("4.count nodes");
			System.out.println("5.check empty");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.print("\npost order : ");
				bst.postorder();
				System.out.print("\npre order : ");
				bst.preorder();
				System.out.print("\ninorder : ");
				bst.inorder();
				break;
			case 2:
				System.out.println("enter integer element to delete");
				bst.delete(scan.nextInt());
				break;
			case 3:
				System.out.println("enter integer element to search");
				System.out.println("search result: "+bst.search(scan.nextInt()));
				break;
			case 4:
				System.out.println("nodes= "+bst.countnodes());
				break;
			case 5:
				System.out.println("empty status= "+bst.isempty());
				break;
				
			}
			System.out.println("\n\ndo you want to continue(type y or no)");
			ch=scan.next().charAt(0);
		}while(ch=='y'|| ch=='Y');
		

	}

}
