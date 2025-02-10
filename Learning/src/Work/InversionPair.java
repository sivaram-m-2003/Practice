package Work;

import java.util.Scanner;

public class InversionPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<A.length;i++) {
			A[i]=sc.nextInt();
		}
		int c=0;
		int x=-1;
		int y=-1;
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				if(A[i]>A[j]) {
					c++;
					x=A[i];
					y=A[j];
				}
			}
		}
			System.out.println(c);
			if(c>0) {
				System.out.print("("+x+","+y+")");
			}
		}
	}
