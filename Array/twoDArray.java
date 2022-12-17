package Array;

import java.util.*;
import java.io.*;
public class twoDArray {
   /* public static void main(String[] args) {
        int arr[][]=new int[4][4];
      //  int rowlength=arr.length;
        //int collength=arr[0].length;
        for(int i=1;i<=arr.length;i++)
        {
            int l=i;
            for(int j=1;j<=arr[0].length;j++)
            {
               // for(int k=1;k<=rowlength;k++) {
                    // int value=arr[i][j];
                  //  int l=i;
                    System.out.print(l + " ");
                    l = l + 4;
              //  }

            }
        System.out.println();
        }

    }*/
  //  import java.io.*; // for handling input/output
//import java.util.*; // contains Collections framework

    // don't change the name of this class
// you can add inner classes if needed
 //   class Main {
        public static void main (String[] args) {
            // Your code here
            Scanner sv=new Scanner(System.in);
            int n=sv.nextInt();
            int a[][]=new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=sv.nextInt();
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[j][i]+" ");
                }
                System.out.println();
            }


        }

}
