package normal;

import java.util.Scanner;

public class secondmax {

    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n= sv.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sv.nextInt();
        }
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(a[i]>first)
                first=a[i];
            if(a[i]>second && first!=a[i])
                second=a[i];
        }
        System.out.println(second);
    }
}
