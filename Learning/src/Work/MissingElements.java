package Work;

import java.util.Scanner;

public class MissingElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++) {
            A[i]=sc.nextInt();
        }
        int h=0;
        if (A[0]>1){
            int start=1;
            int end=A[0]-1;
            if(h==1){
                System.out.print(" ");
            }
            if(start==end){
                System.out.print(start+"-"+end);
            }else{
                System.out.print(start+"-"+end);
            }
            h=1;
        }
        for(int i=0;i<A.length-1;i++){
            int start=A[i]+1;
            int end=A[i+1]-1;
            if (start<=end){
                if(h==1){
                    System.out.print(" ");
                }
                if(start==end){
                    System.out.print(start+"-"+end);
                }else{
                    System.out.print(start+"-"+end);                
                    }

                h=1;
            }
        }
        if(h==0){
            System.out.print("-1");
        }
    }
}
