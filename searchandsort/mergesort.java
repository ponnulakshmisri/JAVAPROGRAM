package searchandsort;

import java.util.*;
public class mergesort {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int k=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sv.nextInt();
        }
        msort(a,k,a.length);
    }
    public static void msort(int a[],int first,int last)
    {
        if(first<last)
        {
            int mid=(first+last)/2;
            msort(a,first,mid);
            merge(a,first,mid,last);
            msort(a,mid+1,last);
        }
    }
    public static void merge(int a[],int low,int mid,int high)
    {
        int i=low;
        int j=mid+1;
        int k=low;
        int b[]=new int[a.length];
        while(i<=mid && j<=high)
        {
            if(a[i]<a[j])
            {
                b[k]=a[i];
                i++;
                k++;
            }
            else
            {
                b[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            b[k]=a[i];
            i++;
            k++;
        }
        while(j<=high)
        {
            b[k]=a[j];
            j++;
            k++;
        }
        for(i=low;i<=high;i++) {
            System.out.println(b[i]);

        }
    }
}