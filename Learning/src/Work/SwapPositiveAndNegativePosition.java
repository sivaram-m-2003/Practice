package Work;

import java.util.Scanner;

public class SwapPositiveAndNegativePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		int pos[]=new int[n];
		int neg[]=new int[n];
		int posi=0;
		int negi=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]>0) {
				pos[posi++]=A[i];
			}
			else {
				neg[negi++]=A[i];
			}
		}
		for(int i=0;i+1<posi;i+=2) {
				int temp=pos[i];
				pos[i]=pos[i+1];
				pos[i+1]=temp;
		}
		for(int i=0;i+1<negi;i+=2) {
				int temp=neg[i];
				neg[i]=neg[i+1];
				neg[i+1]=temp;
		}
		posi=0;
		negi=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]>0) {
				A[i]=pos[posi++];
			}
			else {
				A[i]=neg[negi++];
			}
		}
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
	}

}
