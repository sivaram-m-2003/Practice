package Work;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String str[]=new String[n];
		for(int i=0;i<n;i++) {
        String s=sc.nextLine();
        Pattern pattern=Pattern.compile("\\d+");
        Matcher match=pattern.matcher(s);
        int small=Integer.MAX_VALUE;
        boolean found=false;
        while(match.find()) {
        	int num=Integer.parseInt(match.group());
        	if(num<small) {
        		small=num;
        		found=true;
        	}
        }
        if(found) {
        	System.out.println(small);
        }
        else {
        	System.out.println("-1");
        }
		}
	}

}
