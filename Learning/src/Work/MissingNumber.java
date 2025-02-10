package Work;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		int des=sc.nextInt();
		int max=A[0];
		int min=A[0];
		for(int i=0;i<A.length;i++) {
			if(A[i]<min) {
				min=A[i];
			}
			if(A[i]>max) {
				max=A[i];
			}
		}
		int hash[]=new int[max+1];
		for(int i=0;i<A.length;i++) {
			hash[A[i]]++;
		}
		int count =0;
		for(int i=min;i<=max;i++) {
			if(hash[i]!=1) {
				count++;
			}
		}
        if(count<des) {
        	System.out.println("-1");
        }
        else {
		for(int i=min,j=0;j<des;i++) {
                if(hash[i]!=1) {
				System.out.print(i+" ");
				j++;
	}
		}
        }
	}
}
