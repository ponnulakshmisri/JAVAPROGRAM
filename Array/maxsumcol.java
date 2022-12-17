package Array;

import java.util.Scanner;

public class maxsumcol {
    public static void main(String args[])
    {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int m=sv.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sv.nextInt();
            }
        }
        int maxcolumn= Integer.MIN_VALUE;
        for(int j=0;j<m;j++)
        {
            int col=0;
            for(int i=0;i<n;i++)
            {
                col=col+a[i][j];
            }
        if(col>maxcolumn)
        {
            maxcolumn=col;
        }
        }

        System.out.print(maxcolumn);
    }
}
