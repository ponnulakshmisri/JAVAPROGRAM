package Array;

import java.util.Scanner;

public class runningsumof1darray {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        int a[] = new int[n];
        int a1[]=new int[a.length];
      int var =0;
        for (int i = 0; i <a.length; i++) {
            a[i] = sv.nextInt();
        }
       // a1[0]=
       // System.out.print(a[0] + " ");
        for (int i = 0; i < a.length; i++) {

            var = var + a[i];

            System.out.print(var + " ");
        }
    }
}
