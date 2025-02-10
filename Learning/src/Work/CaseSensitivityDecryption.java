package Work;

import java.util.Scanner;

public class CaseSensitivityDecryption {
	static String conversion(String s) {
		String s1="";
		for(int j=0;j<s.length();j++) {
			char ch=s.charAt(j);
			if(ch>='A' && ch<='Z') {
				s1+='1';
			}
			else {
				s1+='0';
			}
		}

		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=new String[str.length()/5];
		int h=0;
		for(int i=0;i<str.length();i+=5) {
			int end=Math.min(i+5,str.length());
			String s=str.substring(i,end);
			arr[h++]=s;
		}
		String array[]=new String[1000];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				String s=arr[i];
				String st=conversion(s);
			    array[i]=st;
				
			}
	}
		char map[]=new char[32];
		for(int i=0;i<=25;i++) {
			map[i]=(char)('a'+i);
		}
		map[26]='.';
		map[27]=',';
		map[28]=' ';
		map[29]='?';
		map[30]='\'';
		map[31]='"';
		String fin="";
		for(int i=0;i<array.length;i++) {
			if(array[i]!=null) {
			String s=array[i];
			int n=Integer.parseInt(s,2);
		    for(int j=0;j<map.length;j++) {
		    	if(n==j) {
		    		fin+=map[j];
		    	}
		    }
		}
		}
		System.out.print(fin);
}
}
