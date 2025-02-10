package Work;

import java.util.Scanner;

public class BinaryPalindrome {
    static int palindrome(int k) {
    	String str=Integer.toBinaryString(k);
    	String rev="";
    	String ans=str;
    	for(int i=str.length()-1;i>=0;i--) {
    		rev+=str.charAt(i);
    	}
    	if(!rev.equals(ans)) {
    		return 0;
    	}
		return 1;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++) {
        	A[i]=sc.nextInt();
        }
        int h=0;
        for(int i=0;i<A.length;i++) {
        int k=A[i];
        if(palindrome(k)==1) {
        	System.out.print(A[i]+" ");
        	h=1;
        }
        }
        if(h==0) {
        	System.out.print("-1");
        }
	}

}
