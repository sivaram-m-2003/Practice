package Work;

import java.util.Scanner;

public class BinaryString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        for (int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            int n=(int)ch; 
            String bin=Integer.toBinaryString(n);
            while (bin.length()<8){
                bin+="0";
            }
            StringBuilder result=new StringBuilder();
            for (int j=0;j<bin.length();j++){
                if (bin.charAt(j)=='0'){
                    result.append(s1.charAt(j)); 
                } else {
                    result.append(Character.toUpperCase(s1.charAt(j)));
                }
            }
            System.out.print(result+" ");
        }
    }
}
