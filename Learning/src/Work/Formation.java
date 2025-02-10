package Work;

import java.util.Scanner;

public class Formation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String str=String.valueOf(n);
		char ch[]=str.toCharArray();
		String arr[]=new String[10];
		int h=0;
		for(char i='0';i<='9';i++) {
			ch[k-1]=i;
			arr[h++]=String.valueOf(ch);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(Integer.parseInt(arr[i])+" ");
		}
	}

}
