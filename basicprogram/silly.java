package basicprogram;

import java.util.Scanner;

public class silly {
    public static void main(String args[]) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        int ans=0,b=0;
        for(int i=1;i<n;i++)
        {
           // b=ans;
            ans=(i*i)+(i+1)*(i+1)+(i+2)*(i+2);
            //b=ans;
            if(ans<n)
            {
                System.out.println(ans);
            }
        }


    }
}
