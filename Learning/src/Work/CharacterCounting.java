package Work;

import java.util.Scanner;

public class CharacterCounting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int[] A=new int[256];
        for (int i=0; i<str.length();i++) {
            A[str.charAt(i)]++;
        }
        for (int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
            if (A[ch]>0){
                System.out.println(ch+" "+A[ch]);
                A[ch]=0;
            }
        }
    }
}
