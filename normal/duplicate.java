package normal;

import java.util.Arrays;
import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sv.nextInt();
        }
        printTwoElements(a, n);
      /*  Arrays.sort(a);
        for (int i = 1; i < n; i++)
        {
            if(a[i]==a[i-1])
            {
                System.out.print(a[i]+" ");
                break;
            }

        }
        for (int i = 1; i < n; i++) {
            if(a[i-1]!=i)
            {
                System.out.println(i);
            }
        }*/
    }
    static void printTwoElements(int arr[], int size)
    {
        int i;
        System.out.print("The repeating element is ");

        for (i = 0; i < size; i++) {
            int value = Math.abs(arr[i]);
            if (arr[value - 1] > 0)
                arr[value - 1] = -arr[value - 1];
            else
                System.out.println(value);
        }

        System.out.print("and the missing element is ");
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }

}
