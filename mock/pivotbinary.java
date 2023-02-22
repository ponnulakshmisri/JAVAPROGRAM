package mock;

import java.util.Scanner;

public class pivotbinary {
    public static void main(String args[])
    {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sv.nextInt();
        }
        int searchele=sv.nextInt(); //2
        System.out.println(binarysearchele(a, n, searchele));
    }
    public static int binarysearchele(int a[],int n,int key) // 3,4
    {
        int pivot=pivotfun(a,0,n-1); //2
        if (pivot == -1)
            return binarySearch(a, 0, n - 1, key);
        if (a[pivot] == key) // 3
            return pivot;
        if (a[0] <= key) //3<=2
            return binarySearch(a, 0, pivot - 1, key);
        return binarySearch(a, pivot + 1, n - 1, key);
    }
    public static int pivotfun(int a[],int low,int high)// 0,4 // 3 4 5 1 2
    {
        if(high<low)
            return -1;
        if(high==low)
        {

            return low;
        }
        int mid=low+(high-low)/2;//2 // 3+(4-3)/2=2
        if(mid<high && a[mid]>a[mid+1])//2<4 && 5> 1  // 2<4 && 5>1
            return mid;
        if(mid>low && a[mid-1]>a[mid])
            return mid-1;
        if (a[low] >= a[mid])
            return pivotfun(a, low, mid - 1);
        return pivotfun(a, mid + 1, high);

    }
    static int binarySearch(int a[], int low, int high,int key)
    {
        if (high < low)
            return -1;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (key == a[mid])
            return mid;
        if (key > a[mid])
            return binarySearch(a, (mid + 1), high, key);
        return binarySearch(a, low, (mid - 1), key);
    }

}
