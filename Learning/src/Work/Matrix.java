package Work;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n;
        int mat[][]=new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                mat[i][j]=k;
                k+=n;
            }
        }
        for (int i=0;i<mat.length;i++) {
            if (i%2!=0) { 
                int left=0;
                int right=mat[i].length-1;
                while(left<right) {
                    int temp=mat[i][left];
                    mat[i][left]=mat[i][right];
                    mat[i][right]=temp;
                    left++;
                    right--;
                }
            }
        }
        for (int i=0;i<mat.length;i++) {
            for (int j=0;j<mat[i].length;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
