package Assignment_2;
import java.util.Scanner;
public class uniqueword {
	static int calculateuniqueword(String str) {
		String[]words=str.split(" ");
		boolean[]array=new boolean[words.length];
		int j,i=0;
		int count=0;
		for(i=0;i<words.length;i++) {
			if(!array[i]) {
				count++;
				for(j=i+1;j<words.length;j++) {
					if(words[j].compareTo(words[i])==0){
						array[j]=true;
						count--;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String str;
		System.out.println("enter the string: ");
		str=s1.nextLine();
		int count=calculateuniqueword(str);
		System.out.println("total unique words are: "+count);
		

	}

}
