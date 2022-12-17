package Array;

import java.util.Arrays;
import java.util.Scanner;

public class maximum {
public static void main(String args[])
{
    Scanner sv=new Scanner(System.in);
    int n=sv.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sv.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(arr[n-1]+" "+arr[n-2]+" "+arr[n-3]);
}

}
