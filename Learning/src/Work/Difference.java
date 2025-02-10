package Work;

import java.util.Arrays;
import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		Arrays.sort(A);
		
		
		
		for(int i=0;i<A.length-1;i++) {
			int n1=A[i];
			int n2=A[i+1];
			System.out.println(n1+","+n2+"="+(n2-n1));
		}
	}

}
