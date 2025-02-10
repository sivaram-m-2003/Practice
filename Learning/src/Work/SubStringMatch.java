package Work;

import java.util.Scanner;

public class SubStringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String l="-1";
		int len=0;
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<=s1.length();j++) {
			String sub=s1.substring(i,j);
			String sb=new StringBuilder(sub).reverse().toString();
			if(s2.contains(sb)) {
				if(sub.length()>len) {
					len=sub.length();
					l=sub;
				}
			}
		}
		}
		System.out.print(l);
		
		}
	}

