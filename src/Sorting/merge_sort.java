package Sorting;

public class merge_sort {
	void merge(int arr[],int p,int q,int r) {
		int n1=q-p+1;
		int n2=r-q;
		int l[]=new int[n1];
		int m[]=new int[n2];
		for(int i=0;i<n1;i++) {
			l[i]=arr[p+i];
			for(int j=0;j<n2;j++) {
				m[j]=arr[q+1+j];
			}
		}
		int i,j,k;
		i=0;
		j=0;
		k=p;
		while(i<n1 && j<n2) {
			if (l[i]<=m[j]) {
				arr[k]=l[i];
				i++;
			}else {
				arr[k]=m[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=l[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=m[j];
			j++;
			k++;
		}
	}
	void Merge_sort(int arr[],int l,int r) {
		if(l<r) {
			int m=(l+r)/2;
			Merge_sort(arr,l,m);
			Merge_sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	public static void printarray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
				
		}
	}

	public static void main(String[] args) {
		int arr[]= {6,5,12,10,9,1};
		merge_sort ob=new merge_sort();
		ob.Merge_sort(arr,0,arr.length-1);
		System.out.println("sorted array: ");
		printarray(arr);
		

	}

}
