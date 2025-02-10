package Work;

import java.util.Scanner;

public class PalindromeCount {
    static boolean isPalindrome(String s) {
        String reversed="";
        for (int i=s.length()-1;i>=0;i--) {
            reversed+=s.charAt(i);
        }
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s1="";
        String s2="";
        for (int i=0;i<str.length();i++) {
            if (Character.isLetter(str.charAt(i))) {
                s1+=str.charAt(i);
            } else {
                s2+=str.charAt(i);
            }
        }
        String[] parts = {s1,s2};
        int palindromeCount=0;
        for (String part:parts) {
            if (!part.isEmpty()&&isPalindrome(part)) {
                palindromeCount++;
            }
        }
        System.out.println("Letters: "+s1);
        System.out.println("Non-Letters: "+s2);
        if (palindromeCount==1) {
            System.out.println("String has one Palindrome");
        } else if (palindromeCount==2) {
            System.out.println("String has two Palindromes");
        } else {
            System.out.println("String has no Palindromes");
        }
    }
}
