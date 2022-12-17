package basicprogram;

import java.util.Scanner;

import java.util.*;
public class sarapattern {
    public static void main(String args[])
    {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int value=0;
        int value2=0;
        for(int i=0;i<n;i++)
        {
            value2=i*6;
            for(int j=0;j<n;j++)
            {
                value=(j*4)+value2;
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
