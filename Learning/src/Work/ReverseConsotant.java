package Work;

import java.util.Scanner;

public class ReverseConsotant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<=j) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
				i++;
			}
			else if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u'||ch[j]=='A'||ch[j]=='E'||ch[j]=='I'||ch[j]=='O'||ch[j]=='U') {
				j--;
			}
			else {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
			}
		}
		for(int h=0;h<ch.length;h++) {
			System.out.print(ch[h]+" ");
		}
	}

}
