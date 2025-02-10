package Work;

import java.util.Scanner;

public class PrintingNtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s="";
		StringBuilder st=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			int count=0;
			if(c>='1'&&c<='9') {
			 count=Character.getNumericValue(c);
			}
			for(int j=0;j<count;j++) {
				st.append(str.charAt(i-1));
			}
		}
		System.out.print(st.toString());
	}

}
