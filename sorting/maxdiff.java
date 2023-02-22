package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class maxdiff {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sv.nextInt();
        }
        int k,l;
        Arrays.sort(a);
        int maxdiff=a[1]-a[0];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {

                if(a[j]-a[i]>maxdiff)
                {
                    maxdiff=a[j]-a[i];
                    k=j;
                    l=i;
                }
            }

        }
        System.out.println(maxdiff);
    }
}
