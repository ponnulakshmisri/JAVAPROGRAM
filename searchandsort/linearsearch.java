package searchandsort;

import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sv.nextInt();
        }
        int search = sv.nextInt();
     //  int index= searchele(a, n, search);
       // System.out.println(index);
        median(n,a);
    }
    public static int  searchele(int a[],int n,int search)
    {
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==search)
            {
             //  count=count+1;
                return i;
            }

        }
        return -1;
    }
    public static void median(int n,int a[])
    {
        int median=0;
        if(n%2==0)
        {
            median=((n/2)+(n-1)/2)/2;
        }
        else {
            median=(n+1)/2;
        }

        System.out.println(a[median]);
    }
}
