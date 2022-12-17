package contest;

import java.util.*;
public class medianofsortedarray {
    public static void main (String[] args) {
        // Your code here
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int m=sv.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=sv.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sv.nextInt();
        }
        double ans=sortedarray(a,b);
        System.out.print(ans);
    }
    public static double sortedarray(int a[],int b[])
    {
        int n=a.length;
        int m=b.length;
        int c[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<n&&j<m)
        {
            if(a[i]<b[j])
            {
                c[k]=a[i];
                i++;
            }
            else
            {
                c[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<n)
        {
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<m)
        {
            c[k]=b[j];
            j++;
            k++;
        }
        if((n+m)%2!=0)
        {
            return c[(m+n)/2];
        }
        else
        {
            int x=(m+n)/2;
            double p=c[x];
            double q=c[x-1];
            return (p+q)/2;
        }
    }
}

