package Array;

import java.util.*;
public class findeleinarra {
        public static void main (String[] args) {
            // Your code here
            Scanner sv=new Scanner(System.in);
            int m=sv.nextInt();
            int n=sv.nextInt();
            int q=sv.nextInt();

            int a[][]=new int[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=sv.nextInt();
                }
            }
            while(q-->0)
            {
                boolean flag=false;
                int target=sv.nextInt();
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        if(a[i][j]==target)
                        {
                            flag=true;
                            break;
                        }
                        else
                        {
                            flag=false;
                        }
                    }
                }
                if(flag==true)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
        }
    }

