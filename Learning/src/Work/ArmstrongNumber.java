package Work;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		int h=n;
	    int sum=0;
	    int c=0;
	    while(n!=0) {
	    	c++;
	    	n/=10;
	    }
	    while(h!=0) {
	    	int k=h%10;
	    	sum+=Math.pow(k,c);
	    	h/=10;
	    }
	    if(sum==a) {
	    	System.out.println("Armstrong");
	    }
	    else {
	    	System.out.println("Not a Armstrong");
	    }
	}

}
