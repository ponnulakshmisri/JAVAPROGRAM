package Array;
import java.util.*;
public class findidentitymatrix {
    public static void main (String[] args) {
        // Your code here
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int a[][]=new int[n+1][n+1];
        boolean flag=true;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                a[i][j]=sv.nextInt();
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j && a[i][j]!=1)
                {
                    flag=false;
                    break;
                }
                else if(i!=j && a[i][j]!=0)
                {
                    flag=false;
                }
            }
        }
        if(flag==false)
        {
            System.out.print("No");
        }
        else
        {
            System.out.print("Yes");
        }
    }
}

