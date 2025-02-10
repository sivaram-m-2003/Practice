package Work;

import java.util.Scanner;

public class DailyChallenge {
    static boolean isPrime(int n) {
        if (n<2){
        	return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
   static int counting(int start,int end) {
	   int c=0;
	   for(int i=start;i<end;i++) {
		   c++;
	   }
	   if(c>2) {
		   return 0;
	   }
	   return 1;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] primes=new int[n];
        int count = 0;
        for (int i=2;i<=n;i++) {
            if (isPrime(i)) {
                primes[count++]=i;
            }
        }
        int[] bet=new int[n*n]; 
        int betcount=0;
        for (int i=0;i<count-1;i++) {
            int start=primes[i];
            int end=primes[i+1];
            for (int j=start;j<end;j++) {
                if(j!=primes[i]) {
                	int h=counting(start,end);
                	if(h==1) {
                		bet[betcount++]=j;
                	}
                }
            }
        }
        for (int i=0;i<betcount;i++) {
            System.out.print(bet[i]+" ");
        }
    }
}
