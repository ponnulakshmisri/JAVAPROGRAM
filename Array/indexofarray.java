package Array;

import java.util.Scanner;

public class indexofarray {
    public static void main(String args[])
    {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sv.nextInt();
        }
     /*   int searchnum=sv.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==searchnum)
            {
                System.out.print(i);
            }
        }*/
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==(a[j]) &&(i!=j))
                {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
