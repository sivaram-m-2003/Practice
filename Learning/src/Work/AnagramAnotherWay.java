package Work;

import java.util.Scanner;

public class AnagramAnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(IsAnagaram(s1,s2)) {
			System.out.print("Anagram");
		}
		else {
			System.out.print("Not a Anagram");
		}
		
	}

	private static boolean IsAnagaram(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length()) {
			return false;
		}
		char ch[]=new char[256];
		for(int i=0;i<s1.length();i++) {
			ch[s1.charAt(i)]++;
			ch[s2.charAt(i)]--;
		}
		for(int i=0;i<ch.length;i++) {
			if(i!=0) {
				return true;
			}
		}
		return false;
	}

}
