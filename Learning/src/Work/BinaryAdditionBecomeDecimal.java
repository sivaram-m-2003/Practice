package Work;

import java.util.Scanner;

public class BinaryAdditionBecomeDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		String s1=Integer.toBinaryString(n1);
		String s2=Integer.toBinaryString(n2);
		String s3=s1.concat(s2);
		int ans=Integer.parseInt(s3,2);
		System.out.println(ans);
	}

}
