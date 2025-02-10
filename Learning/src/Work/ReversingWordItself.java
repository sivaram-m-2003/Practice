package Work;

import java.util.Scanner;

public class ReversingWordItself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word[]=sc.nextLine().split(" ");
		String st[]=new String[word.length];
		for(int i=0;i<word.length;i++) {
			String s=word[i];
			String str="";
			for(int j=s.length()-1;j>=0;j--) {
				str+=s.charAt(j);
			}
			st[i]=str;
			
		}
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]+" ");
		}
	}

}
