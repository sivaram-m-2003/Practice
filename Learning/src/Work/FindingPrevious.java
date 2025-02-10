package Work;

import java.util.Scanner;

public class FindingPrevious {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int diff=Math.abs(n1-n2);
        int larger=Math.max(n1,n2);
        int smaller=Math.min(n1,n2);
        for (int i=0;i<diff;i++) {
          System.out.print(larger-- +" "+smaller-- +" ");
        }
    }
}
