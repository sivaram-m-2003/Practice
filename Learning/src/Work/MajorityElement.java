package Work;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
//		Arrays.sort(num);
//		int len=num.length;
//		int k=num[len/2];
//		System.out.print(k);
		
		int maxi=num[0];
		int A[]=new int[num.length];
		for(int i=0;i<num.length;i++) {
			A[i]=1;
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					A[i]++;
					num[j]=0;
				}
			}
		}
		int max=A[0];
		for(int i=0;i<A.length;i++) {
			if(A[i]>max) {
				max=A[i];
				maxi=num[i];
			}
		}
		System.out.print(maxi);
	}

}
