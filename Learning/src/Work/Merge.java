package Work;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int A1[]=new int[n1];
		for(int i=0;i<A1.length;i++) {
			A1[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int A2[]=new int[n2];
		for(int i=0;i<A2.length;i++) {
			A2[i]=sc.nextInt();
		}
				
		int i=0;
		int j=0;
		int k=0;
		int res[]=new int[n1+n2];
		while(i<n1 && j<n2) {
			if(A1[i]<=A2[j]) {
				res[k]=A1[i];
				i++;
			}
			else {
				res[k]=A2[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			res[k]=A1[i];
			i++;
			k++;
		}
		while(j<n2) {
			res[k]=A2[j];
			j++;
			k++;
		}
		for(int h=0;h<res.length;h++) {
			for(int l=h+1;l<res.length;l++){
				int temp=0;
				if(res[h]>res[l]) {
					temp=res[h];
					res[h]=res[l];
					res[l]=temp;
				}
			}
		}
		for(int m=0;m<res.length;m++) {
			System.out.print(res[m]+" ");
		}
	}

}
