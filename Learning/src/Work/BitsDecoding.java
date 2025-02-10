package Work;

import java.util.Scanner;

public class BitsDecoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    StringBuilder s=new StringBuilder();
	    int i=0;
	    while(i<str.length()) {
	    	if(str.charAt(i)=='0') {
	    		s.append('a');
	    		i++;
	    	}
	    	else if(i+1<str.length() && (str.charAt(i)=='1' && str.charAt(i+1)=='0')) {
	    		s.append('b');
	    		i+=2;
	    	}
	    	else if(i+1<str.length()&& (str.charAt(i)=='1' && str.charAt(i+1)=='1')) {
	    		s.append('b');
	    		i+=2;
	    	}
	    	else {
	    		System.out.print("-1");
	    		return;
	    	}
	    }
	    String st=new String(s);
	    System.out.print(st);
	   }
	}
