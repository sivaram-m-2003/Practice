package Work;

import java.util.Arrays;
import java.util.Scanner;

public class MaxDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int A[]=new int[n];
    for(int i=0;i<n;i++) {
    	A[i]=sc.nextInt();
    }
    Arrays.sort(A);
    for(int i=0;i<A.length;i++) {
    	System.out.print(A[i]+" ");
    }
    System.out.println();
    int maxdiff=0;
    for(int i=0;i<A.length-1;i++) {
    	int n1=A[i];
    	int n2=A[i+1];
    	int diff=n2-n1;
    	if(diff>maxdiff) {
    		maxdiff=diff;
    	}
    }
    System.out.println(maxdiff);
	}

}
