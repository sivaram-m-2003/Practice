package Work;

import java.util.Scanner;

public class CountingDigits {
	static int getCount(int num) {
		return Integer.toString(num).length();
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int A[]=new int[n];
	for(int i=0;i<n;i++) {
		A[i]=sc.nextInt();
	}
	int d=sc.nextInt();
	int digit=0;
	int sum=0;
	for(int i=0;i<n;i++) {
		int num=A[i];
		int count=getCount(num);
		if(digit+count>d) {
			System.out.println(sum);
			digit=count;
			sum=num;
			System.out.print(num+" ");
		}
		else {
			System.out.print(num+" ");
			sum+=num;
			digit+=count;
		}
	}
	System.out.println(sum);
}
}
