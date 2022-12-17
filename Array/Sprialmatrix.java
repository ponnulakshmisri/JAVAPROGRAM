package Array;

import java.util.Scanner;

public class Sprialmatrix {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int a[][]=new int[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            a[i][j]=sv.nextInt();
        }
    }
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i][0]+" ");
            }
            for(int i=1;i<n;i++) {
                System.out.print(a[n-1][i] + " ");

            }
        for(int i=n-2;i>=0;i--) {
            System.out.print(a[i][n-1] + " ");

        }
        for(int i=n-2;i>0;i--) {
            System.out.print(a[0][i] + " ");

        }
        for(int i=1;i>0;i--)
        {
            for(int j=1;j<=n-2;j++)
            {
                System.out.print(a[j][i]+" ");
            }
        }
    }
}
