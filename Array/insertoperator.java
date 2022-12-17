package Array;

import java.util.*;
public class insertoperator {
    static boolean isSum(long[] arr,int index,long sum,long k){
        if(index==-1){
            return sum==k;
        }
        else{
            return isSum(arr,index-1,sum+arr[index], k) || isSum(arr,index-1,sum-arr[index],k);
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }

        if(isSum(arr,n-1,0,k)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
        // Your code here
    }
}
