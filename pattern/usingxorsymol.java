package pattern;
import java.util.*;
public class usingxorsymol {
    public static void main(String args[])
    {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        System.out.println("*");
        for(int i=1;i<n-1;i++)
        {
            System.out.print("*");
            for(int j=0;j<i;j++)
            {
                System.out.print("^");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<=n;i++)
        {
            System.out.print("*");
        }
    }
}
