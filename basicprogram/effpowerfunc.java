package basicprogram;
import java.util.*;
public class effpowerfunc {
    /*
    Implement the power(a, n) function which return the value an in log(n) time complexity.

The value can be very large so return the answer with modulo M=1e9+7
     */
    public static long power(long x, long n)
    {

        long pow = 1L;

        long m=1000000007;
        for (int i = 0; i < n; i++) {
            pow = (pow * x)%m;
        }

        return pow;
    }

    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        long s=sv.nextLong();
        long n=sv.nextLong();
        long ans=power(s,n);
        System.out.println(ans);
    }
}
