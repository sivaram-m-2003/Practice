package Work;

import java.util.Scanner;

public class Combination {
	static final String[] s={
		" ",
		"@_",
		"abc",
		"def",
		"ghi",
		"jkl",
		"mno",
		"pqrs",
		"tuv",
		"wxyz"
	};
	public static void combine(String digits,int index,String cur) {
		if(index==digits.length()) {
			System.out.print(cur+" ");
			return;
		}
		int digit=digits.charAt(index)-'0';
		String let=s[digit];
		for(char ch:let.toCharArray()) {
			combine(digits,index+1,cur+ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=String.valueOf(n);
		combine(str,0,"");
        }
	}

