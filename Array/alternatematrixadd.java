package Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class alternatematrixadd {
    /*
    You are given a chessboard of size N x N, where the top left square is black. Each square contains a value. Find the sum of values of all black square and all white squares.

Remember that in a chessboard black and white squares alternate.
     */
    public static void main (String[] args) {
        // Your code here
        FastReader sv = new FastReader();
        int n=sv.nextInt();
        int a[][]=new int[n][n];
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sv.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if ((i+j) % 2 == 0)
                    sum1 += a[i][j];

                else // count the elements at odd places
                    sum2 += a[i][j];

            }
        }
        System.out.println(sum1);
        System.out.print(sum2);
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
