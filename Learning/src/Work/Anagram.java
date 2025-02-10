package Work;
import java.util.Scanner;

public class Anagram {
		public static int AnagramPro(String str1,String str2) {
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();
		    int c1=0;
		    int c2=0;
			if(str1.length()!=str2.length()) {
				return 0;
			}
				for(int i=0;i<str1.length();i++) {
					char ch=str1.charAt(i);
					for(int j=0;j<str1.length();j++) {
						if(str1.charAt(j)==ch) {
						    c1++;
						}
						if(str2.charAt(j)==ch) {
							c2++;
						}
					}
				}
				if(c1!=c2) {
					return 0;
				}
			
			return 1;
			
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int res=AnagramPro(str1,str2);
		if(res==1) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagaram");
		}
		
	}
	}

