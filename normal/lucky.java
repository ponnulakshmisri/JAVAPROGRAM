package normal;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class lucky {

    // don't change the name of this class
// you can add inner classes if needed

        public static void main (String[] args) {
            // Your code here
            Scanner sv=new Scanner(System.in);
            int a1=sv.nextInt();
            int a2=sv.nextInt();
            int a3=sv.nextInt();

            int sum=a1+a2;
            int sum1=a2+a3;
            int sum2=a1+a3;
            if(sum%2==0 && sum>0 || sum1%2==0 && sum1>0 || sum2%2==0 && sum2>0)
            {
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }

        }
    }

