package Work;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    sc.nextLine();
	    String str[]=new String[n];
	    for(int i=0;i<n;i++) {
	    	str[i]=sc.nextLine();
	    }
	    String ch[]=new String[str.length];
	    int k=sc.nextInt();
	    for(int i=0;i<k;i++) {	    	
	    	for(int j=0;j<str.length-1;j++) {
	    		String s1=str[j];
	    		String s2=str[j + 1];
	    		String sh=s1.charAt(0)+s2.substring(1,s2.length()-1)+s1.charAt(s1.length()-1);
	    		ch[j]=sh;
	    	}
	    	String s1=str[0];
	    	String s2=str[str.length-1];
	    	String ans=s2.charAt(0)+s1.substring(1,s1.length()-1)+s2.charAt(s2.length()-1);
	    	ch[ch.length-1]=ans;
	    	for(int j=0;j<str.length;j++) {
	    		str[j]=ch[j];
	    	}
	    }
	    for(int i=0;i<ch.length;i++) {
		   System.out.println(ch[i]);
	    }
	    sc.close();
  }
}
