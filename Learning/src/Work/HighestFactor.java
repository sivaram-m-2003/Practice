package Work;

import java.util.Scanner;

public class HighestFactor {
static int factor(int k) {
	int c=0;
	for(int i=1;i<=k;i++) {
		if(k%i==0) {
			c++;
		}
	}
	return c;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		int max=0;
		int h=0;
		for(int i=0;i<A.length;i++) {
			int k=A[i];
			int count=factor(k);
			if(count>max) {
				max=count;
				h=A[i];
			}
		}
		System.out.println(h+" "+max);
	}

}
