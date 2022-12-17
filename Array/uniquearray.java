package Array;// contains Collections framework

import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class uniquearray {
    public static void main (String[] args) {
        // Your code here
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int temp[]=new int[n+1];
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            a[i]=sv.nextInt();
        }
       int tmp =a[1];
       // Arrays.sort(a);
        for(int i=1;i<=n;i++)
        System.out.print(a[i]+" ");

            for(int j=1;j<=n;j++) {
                if (a[j] != tmp) {
                    temp[j] = a[j];
                    tmp = a[j];
                }
                else {
                    break;
                }

        }
        for(int i=1;i<=temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}

