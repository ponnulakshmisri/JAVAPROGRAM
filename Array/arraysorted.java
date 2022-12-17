package Array;

import java.util.*;
public class arraysorted {

    public static void main (String[] args) {
        Scanner sv=new Scanner(System.in);
        int m=sv.nextInt();
        while(m-->0)
        {
            int n=sv.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sv.nextInt();
            }

            rotation(a,n);

        }
    }
    static void rotation(int arr[], int n)
    {
        int minEle = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE;

        int minIndex = -1;


        for (int i = 0; i < n; i++) {
            if (arr[i] < minEle) {
                minEle = arr[i];
                minIndex = i;
            }
        }

        //      boolean flag1 = true;


        for (int i = 1; i < minIndex; i++) {
            if (arr[i] < arr[i - 1]) {
                //   flag1 = false;
                break;
            }
        }

        // boolean flag2 = true;


        for (int i = minIndex + 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                //  flag2 = false;
                break;
            }
        }

        if (minIndex == 0) {
            System.out.print("NO");
            return;
        }

        if ( (arr[n - 1] < arr[0]))
            System.out.println("YES");
        else
            System.out.print("NO");
    }
}

