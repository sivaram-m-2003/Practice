package Work;

import java.util.Scanner;

public class FindTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		String sentence[]=str.split("\\.");
		String word[]=str.split("\\s+");
		if(n<0) {
			n=word.length+n+1;
		}
		int count=0;
		for(int i=0;i<sentence.length;i++) {
			String s=sentence[i];
			String[] sen=s.trim().split("\\s+");
			count+=sen.length;
			if(count>=n) {
				System.out.print(s.trim()+".");
			}
		}
		
	}

}
