package searchandsort;

import java.util.*;
public class insertsort {
    public static void main(String[] args) {
        /*leetcode 35
        Input: nums = [1,3,5,6], target = 5
Output: 2
         */
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sv.nextInt();
        }
        int target=sv.nextInt();
        int ans=search(a,target);
        System.out.println(ans);
    }
    public static int search(int a[],int target)
    {
        int left=0;
        int right=a.length;
        while(left<right)
        {
            int mid=(left+right)/2;
            if(a[mid]==target)
            {
                return mid;
            }
           else if(a[mid]<target)
            {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }

            return left;
    }
}
