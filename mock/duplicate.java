package mock;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicate {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sv.nextInt();

        }
        HashSet<Integer> list=new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(a[i]);
        }

        System.out.println(list);
        for(int i=0;i<n;i++)
        {

                System.out.println(Collections.frequency(list,a[i]));

        }

    }
}
