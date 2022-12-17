package recursion;

import java.util.*;
public class powern {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int pow=sv.nextInt();
       int s= powern(n,pow);
       System.out.print(s);
    }
    public static int powern(int n,int pow)
    {
        if(pow==0)
            return 1;
        int fac=powern(n,pow-1);
        int ans=fac*n;
        return ans;
    }
}
