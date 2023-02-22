package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class mincuttree {
    public static int woodCollect(int[] arr,int n, int mid)
    {
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) //i=3
        {
            if (arr[i] - mid <= 0){// 1-1<=0
                continue;
            }
            else{
                sum += (arr[i] - mid);//2
            }
        }
        return sum;
    }

    public static int mincut(int[] arr,int n, int k)
    {

        Arrays.sort(arr);// 1 1 2 2

        int low = 0, high = arr[n-1];

        while (low <= high)          ///
        {
            int mid = low + ((high - low) / 2);/// low+high/2->0+2/2=1;

            int collected = woodCollect(arr,n, mid);

            if (collected == k)
                return mid;

            if (collected > k)   ////k=3,colected=5  4 6 8 10
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int k =sc.nextInt();
        int[] arr=new int[n];               //
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(mincut(arr,n,k));
    }
}
