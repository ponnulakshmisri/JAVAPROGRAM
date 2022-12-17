package Array;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
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
    public static void main (String[] args) {
        FastReader scn = new FastReader();
        int n = scn.nextInt();
        while(n-->0){
            int ar = scn.nextInt();
            int [] arr = new int[ar];
            for(int i=0;i<ar;i++){
                arr[i]=scn.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[ar-1]+" "+arr[ar-2]+" "+arr[ar-3]);
        }
    }
}