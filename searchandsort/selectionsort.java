package searchandsort;

import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int t=sv.nextInt();
        while(t-->0)
        {
            int n=sv.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sv.nextInt();
            }
            slectionsort(a);
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }

    }
    public static void slectionsort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int lowest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[lowest]) {
                    lowest = j;
                }

            }
            //swap the element
            int temp = a[lowest];
            a[lowest] = a[i];
            a[i] = temp;
        }

    }
}
