package Work;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        String ans=str;
        for(int i=str.length()-1;i>=0;i--) {
        	rev+=str.charAt(i);
        }
        if(rev.equals(ans)) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
	}

}
