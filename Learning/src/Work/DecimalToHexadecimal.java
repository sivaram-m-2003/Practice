package Work;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char A[]=new char[1];
		int i=0;
		while(n!=0) {
			int h=n%16;
			 if(h<10) {
				 A[i]=(char)(h+48);
				 i++;
			}
			 else {
				 A[i]=(char)(h+55);
				 i++;
			 }
			 n=n/16;
		}
		for(int j=A.length-1;j>=0;j--) {
			System.out.print(A[j]);
		

	}
  }
}
