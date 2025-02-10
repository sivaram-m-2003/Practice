package Work;

import java.util.Scanner;

public class HardCoding {
	  public static int countOccurrences(String str, String p) {
	       int count=0;
	       for(int i=0;i<=str.length()-p.length();i++) {
	    	   if(str.substring(i,i+p.length()).equals(p)) {
	    		   count++;
	    	   }
	       }
	       return count;
	    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        String p="101";
        int count=0;
        for (int i=1;i<=n;i++) {
            String str=Integer.toBinaryString(i);
            int c=countOccurrences(str,p);
            if (c>=h) {
                count++;
            }
        }
        
       System.out.print(count);
    }
}
