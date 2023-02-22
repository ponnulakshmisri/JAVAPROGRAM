package sorting;

import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sv.nextInt();
        }
        int low=0;
        int high=a.length-1;
        quicksortalgo(a,low,high);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }
    public static void quicksortalgo(int a[],int low,int high)
    {
        if(low>high)
        {
            return;
        }
        int partition=partition(a,low,high);
        quicksortalgo(a,low,partition-1);
        quicksortalgo(a,partition+1,high);
    }
    public static int partition(int a[],int low,int high)
    {
        int pivot=a[high];
        int i=low-1;
        for (int j = low; j <=high-1 ; j++) {
            if(a[j]<pivot)
            {
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return i+1;
    }
}
