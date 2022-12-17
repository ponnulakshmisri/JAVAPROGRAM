package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sumofnumbers {
    public static void main(String[] args) throws Exception {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        int n = Integer.parseInt(br.readLine());
        // int sum=0;
        // int b;
        if(n<0)
        {
            n=Math.abs(n);
        }
        int sum = sumofnumber(n);
        System.out.println(sum);
    }
    public static int sumofnumber(int n)
    {
        int sum=0,b=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+i;
           // b=sum;

        }
return sum;
    }
}
