package basicprogram;

public class timecomplexity {
    public static void main(String[] args) {
        int a=5;
        int v=tiop(a);
        System.out.println(v);
    }
    public static int tiop(int a)
    {
        int ans=0;
        int b=a;
        while(a!=0)
        {
            b=a;
            while(b!=0)
            {
                ans=ans+a*b;
                b--;
            }
            a--;
        }
        return ans;
    }
}
