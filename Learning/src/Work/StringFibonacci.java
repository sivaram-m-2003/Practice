package Work;

import java.util.Scanner;

public class StringFibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s1="a";
		String s2="b";
		if(n==1) {
			System.out.print(s1);
		}
		else {
			System.out.print(s1+" "+s2+" ");
		}
		for(int i=2;i<n;i++) {
			String s3=s1+s2;
			s1=s2;
			s2=s3;
			String ans="";
			for(int j=s3.length()-1;j>=0;j--) {
				ans+=s3.charAt(j);
			}
			System.out.print(ans+" ");
		}
	}

}
