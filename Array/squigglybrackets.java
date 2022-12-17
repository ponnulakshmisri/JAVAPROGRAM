package Array;

import java.util.*;
public class squigglybrackets {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        ArrayList<String>ans=new ArrayList<>();
        paranthsis(n,0,0,"",ans);
        for(String s:ans)
        {
            System.out.println(s);

        }
    }
    public static void paranthsis(int n,int open,int close,String s,ArrayList<String>ans)
    {
     if(open==n&&close==n)
     {
         ans.add(s);
         return;
     }
     if(open<n)
     {
         paranthsis(n,open+1,close,s+"{",ans);
     }
     if(close<open)
     {
         paranthsis(n,open,close+1,s+"}",ans);
     }
    }
}
