package pattern;

import java.util.*;
public class pascaltrianglelist {
    public static void main(String[] args) {

        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
       int a[]=pascaltriangle(n);
       for(int item:a) {
           System.out.print(item + " ");
       }
       }
       public static int[] pascaltriangle(int n)
       {
       n=n-1;
       if(n<0)
       {
           return new int[0];
       }
       int prevarr[]=new int[1];
       prevarr[0] =1;
       while(n>0)
       {
           int nextrowarray[]=new int[prevarr.length+1];
           nextrowarray[0]=1;
           for(int i=1;i<prevarr.length;i++)
           {
               nextrowarray[i]=prevarr[i]+prevarr[i-1];
           }
           prevarr=nextrowarray;
           n--;
       }
       return prevarr;
       }
}
