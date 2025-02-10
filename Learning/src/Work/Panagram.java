package Work;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().replace(" ","");
		boolean find=true;
		char A[]=new char[26];
		for(int i=0;i<str.length();i++) {
			A[Character.toLowerCase(str.charAt(i)-'a')]++;
		}
		for(int i=0;i<26;i++) {
			if(A[i]==0) {
				find=false;
				break;
			}
		}
		if(find==true) {
			System.out.print("Panagram");
		}
		else {
			System.out.print("Not a Panagram");
		}
	}

}
