package basicprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class findit {
    public static void main (String[] args)throws Exception {
        // Your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long k=Long.parseLong(br.readLine());
        long s=0;
        boolean flag=false;
        long s1=(long)Math.sqrt(k)-1;
        long e=(long)Math.sqrt(k);
        for(long i=s1;i<=e;i++)
        {

            if(k==((i*i)+3*i))
            {
                s=i;
                flag=true;
                break;
            }
            else
            {
                flag=false;
            }


        }
        if(flag==true)
        {
            System.out.print(s);
        }
        else{
            System.out.print("-1");
        }
    }
}