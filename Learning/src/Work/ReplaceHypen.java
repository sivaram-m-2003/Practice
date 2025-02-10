package Work;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceHypen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		char arr[][]=new char[n1][n2];
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				arr[i][j]=sc.next().charAt(0);
			}
		}
		for(int i=0;i<n1;i++) {
			char ch[]=new char[n2];
			int index=n2-1;
			for(int j=n2-1;j>=0;j--) {
				if(arr[i][j]=='A') {
					ch[index--]='A';
				}
			}
			for(int j=0;j<=index;j++) {
				ch[j]='-';
			}
			for(int j=0;j<n2;j++) {
				arr[i][j]=ch[j];
			}
		}
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
  }
}
