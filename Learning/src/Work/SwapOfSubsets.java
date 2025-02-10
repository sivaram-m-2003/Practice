package Work;

import java.util.Scanner;

public class SwapOfSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		for(int i=0;i<n;i+=6) {
			for(int j=0;j<3;j++) {
				int temp=A[i+j];
				A[i+j]=A[i+3+j];
				A[i+3+j]=temp;
			}
		}
		for(int i=0;i<A.length-1;i++) {
			int sum=A[i]+A[i+1];
			System.out.println(A[i]+"+"+A[i+1]+"="+sum);
		}
}
}
