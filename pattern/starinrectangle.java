package pattern;

import java.util.Scanner;

public class starinrectangle {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);

        int m=sv.nextInt();

        int n=sv.nextInt();
        for(int k=0;k<n;k++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<m-1;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(j==1 ||j==n) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int l=0;l<n;l++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
