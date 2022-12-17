package searchandsort;

import java.util.*;
public class midsearch {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sv.nextInt();
        }
        System.out.println("Enter the searching element");
        int srch = sv.nextInt();
        Arrays.sort(a);
         searchele(a, srch);
       // System.out.println(ans);
    }
    public static void searchele(int a[],int srch) {
        int n = a.length;
        int index=0;
        int a1[]=new int[n];
        int var = 0, mid = 0;

        var = (n) / 2;
        mid = a[var];
        if (mid == srch) {
          //  return mid;
            System.out.println("Present");
        } else if (mid > srch) {
            for(int i=0;i<mid;i++)
            {
                if(a[i]==srch)
                {
                    System.out.print("Present");
                }
            }
        }
        else if (mid< srch) {
            for(int i=mid;i<a.length;i++)
            {
                if(a[i]==srch)
                {
                    System.out.print("Present");
                }
            }

        }
        else {
           // return 0;
            System.out.println("Not present");
        }
    }

}
