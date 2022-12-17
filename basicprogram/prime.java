package basicprogram;

import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int count=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sv.nextInt();
        }
        int temp=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]==temp)
            {
                count=count+1;
                if(count==3)
                {
                    System.out.println("Yes");
                }
            }
            else
            {
                temp=a[i];
                count=0;
            }

        }
        if(count!=3)
        {
            System.out.println("No");

        }
    }
    }

