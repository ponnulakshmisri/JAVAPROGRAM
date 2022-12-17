package Array;

import java.util.*;

public class findpeakelement {
    /*
162. Find Peak Element
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
     */
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sv.nextInt();
        }
        int ans=peak(a);
        System.out.println(ans);
    }
    public static  int peak(int a[])
    {
        int left=0;
        int right=a.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(a[mid]<a[mid+1])
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return left;
    }
}
