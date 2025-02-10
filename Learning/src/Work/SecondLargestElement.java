package Work;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		int l=Integer.MIN_VALUE;
		int s=Integer.MIN_VALUE;
		for(int i=0;i<A.length;i++) {
			if(A[i]>l) {
				s=l;
				l=A[i];
			}
			else if(A[i]>s && A[i]!=l) {
				s=A[i];
			}
		}
		System.out.print(s);
	}

}
