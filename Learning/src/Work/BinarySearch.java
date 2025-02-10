package Work;

import java.util.Scanner;

public class BinarySearch {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int Array[]=new int[n];
		for(int i=0;i<n;i++) {
			Array[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		
		int first=0;
		int last=Array.length-1;
		int mid=(first+last)/2;
		while(first<=last) {
			if(Array[mid]<key) {
				first=mid+1;
			}
			else if(Array[mid]==key) {
				System.out.print("Element found at index:"+ mid);
				break;
			}
		else {
				last=mid-1;
			}
			if(first>last) {
				System.out.println("Element not found");
			}
		}
	}

}
