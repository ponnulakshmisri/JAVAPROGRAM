package searchandsort;

import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sv.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if (a[j] > a[j + 1]) {

                    int temp = a[j];

                    a[j] = a[j + 1];

                    a[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
