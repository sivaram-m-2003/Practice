package Work;

import java.util.Scanner;

public class FourDigitsIntegerDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		int c=0;
		for(int i=0;i<=str.length()-4;i++) {
		String s=str.substring(i,i+4);
		if(s.charAt(0)!='0') {
		int res=Integer.parseInt(s);
		if(res%n==0) {
			c++;
		}
		}
		}
		System.out.print(c);
	}

}
