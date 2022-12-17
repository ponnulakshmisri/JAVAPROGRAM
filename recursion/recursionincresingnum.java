package recursion;

import java.util.*;
public class recursionincresingnum {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        incresingdecresing(n);
     //   recusionincresing(n);
        System.out.println();
      //  decresingnum(n);
        skipdigits(n);
    }

    public static void recusionincresing(int n) {
        if (n == 0)
            return;

        recusionincresing(n - 1);
        System.out.print(n+" ");


    }

    public static void decresingnum(int n) {
        if (n > 0) {
            System.out.print(n+" ");
            decresingnum(n - 1);
        }
        else return;
    }
    public static void incresingdecresing(int n)
    {
        if (n == 0)
            return;

        System.out.print(n+" ");
        incresingdecresing(n - 1);

        System.out.print(n+" ");
    }
    public static void skipdigits(int n)
    {
        if (n == 0)
            return;
        if(n%2==0)
            System.out.print(n+" ");
        skipdigits(n - 1);
        if(n%2==0)
            System.out.print(n+" ");
    }
}
