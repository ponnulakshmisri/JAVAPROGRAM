package Array;

import java.util.*;
public class minirotatedarray {
    public static void main(String[] args) {
       /*Find Minimum in Rotated Sorted Array
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

        */
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sv.nextInt();
        }
        int ans=rotation(a);
        System.out.println(ans);
    }
    public static int rotation(int a[])
    {
        int left=0;
        int right=a.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(a[mid]>a[right])
            {
                left=mid+1;
            }
            else {
                right=mid;
            }
        }
        return a[left];
    }
}
