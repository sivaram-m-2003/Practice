package Work;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int A[]=new int[n];
       for(int i=0;i<n;i++) {
    	   A[i]=sc.nextInt();
       }
       int h=sc.nextInt();
       int first=0;
       int last=0;
       
       int c=0;
       for(int i=0;i<A.length;i++) {
    	   if(A[i]==h) {
    		   c++;
    	   }
       }
       for(int i=0;i<A.length;i++) {
    	   if(A[i]==h) {
    		   first=i;
    		   break;
    	   }
       }
       for(int i=A.length-1;i>=0;i--) {
    	   if(A[i]==h) {
    		   last=i;
    		   break;
    	   }
       }
      int arr[]=new int[first+last];
      int k=0;
       for(int i=first+1;i<last;i++) {
    	   arr[k++]=A[i];
    	  }
    	Arrays.sort(arr);
    	if(c>=2) {
    		for(int i=0;i<arr.length;i++) {
    			if(arr[i]!=0) {
    			System.out.print(arr[i]+" ");
    		}
    		}
    	}
    	else {
    		System.out.print("-1");
    	}
       }
 
	}

