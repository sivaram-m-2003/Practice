package Work;

import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String st1="";
		String st2="";
		String temp="";
		for (int i=0;i<str.length()-1;i++) {
			char ch1=str.charAt(i);
			char ch2=str.charAt(i+1);
			int n1=Character.getNumericValue(ch1);
			int n2=Character.getNumericValue(ch2);

			if ((n1%2!=0&&n2%2==0)||(n1%2==0&&n2%2!=0)) {
				temp+=ch1;
				if (i==str.length()-2) {
					temp+=ch2;
				}
			} else {
				temp+=ch1;
				if (temp.length()>st1.length()) {
					st1=temp;
				}
				temp="";
			}
		}
		if (temp.length()>st1.length()){
			st1=temp;
		}
		System.out.print(st1);
	}
}
