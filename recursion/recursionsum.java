package recursion;

import java.util.*;
public class recursionsum {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int res=recursion1(n);
        System.out.println(res);

    }
    public static int recursion1(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int sum=n+recursion1(n-1);
        return sum;
    }
}
