package Work;

import java.util.Scanner;

public class MissingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String miss="";
		for(char i='a';i<='z';i++) {
			String rev="";
			 rev+=i;
			if(!str.contains(rev)) {
				miss+=i;
			}
		}
		System.out.print(miss);
	}

}
