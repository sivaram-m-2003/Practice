package Work;

import java.util.Scanner;

public class Between {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		String s="";
		for(int i=0;i<ch.length-1;i++) {
			char c1=ch[i];
			char c2=ch[i+1];
			if(c1<=c2) {
			for(char j=c1;j<=c2;j++) {
				s+=j;
			}
			}else{
				for(char h=c1;h<='z';h++) {
					s+=h;
				}
				for(char k='a';k<=c2;k++) {
					s+=k;
				}
			}
		}
		System.out.print(s);
	}

}
