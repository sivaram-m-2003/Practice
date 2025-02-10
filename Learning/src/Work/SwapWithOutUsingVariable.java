package Work;

import java.util.Scanner;

public class SwapWithOutUsingVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		// A=5 B=7 After a swap A will be A=7 and B will be 5
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print(a+" "+b);
	}

}
