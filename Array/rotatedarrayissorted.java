package Array;
import java.util.*;
public class rotatedarrayissorted {
    /*
    Given an array arr[] of N distinct integers, check if this array is Sorted and Rotated clockwise.
A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.

Note:-Array can be sorted both increasingly and decreasingly
     */
    public static void main (String[] args) {
        Scanner sv=new Scanner(System.in);
        int m=sv.nextInt();
        while(m-->0)
        {
            int n=sv.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sv.nextInt();
            }
            rotation(a,n);

        }
    }
    static void rotation(int a[], int n)
    {
        int count=0;
        if(a[0]>a[n-1])
        {
            for(int i=1;i<n;i++)
            {
                if(a[i]>a[i-1])
                {
                    continue;
                }
                count++;
            }
            if(count==1)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        solve(a,n);

    }
    public static void solve(int a[],int n)
    {
        int count=0;
        if(a[0]<a[n-1])
        {
            for(int i=1;i<n;i++)
            {
                if(a[i]<a[i-1])
                {
                    continue;
                }
                count++;
            }
            if(count==1)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}

