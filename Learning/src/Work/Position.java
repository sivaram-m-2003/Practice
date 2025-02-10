package Work;

import java.util.Scanner;

public class Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int A1[]=new int[s1.length()];
		int A2[]=new int[s2.length()];
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
            int h=(int)c;
			if(h>=65 && h<=90) {
				A1[i]=i+1;
			}
		}
		for(int i=0;i<s2.length();i++) {
			char c=s2.charAt(i);
            int h=(int)c;
			if(h>=65 && h<=90) {
				A2[i]=i+1;
			}
		}
		String s="";
		for(int i=0;i<s1.length();i++) {
			if(A2[i]!=0) {
			s+=s1.charAt(i);
  			}
		}
		for(int i=0;i<s2.length();i++) {
			if(A1[i]!=0) {
			s+=s2.charAt(i);
  			}
		}
		System.out.print(s);
		}
	}
