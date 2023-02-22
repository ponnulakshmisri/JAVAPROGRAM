package normal;

import java.io.*; // for handling input/output
import java.util.*;
public class sample {

        public static void main (String[] args){
            Scanner sv=new Scanner(System.in);
            int n=sv.nextInt();
            int k=sv.nextInt();
            int a[]=new int[n+1];
          /*  for(int i=1;i<=n;i++)
            {
                a[i]=i;
            }*/
            String s="";
            for(int i=1;i<=n;i++){
                s=s+i;
            }

            ArrayList<String>al=new ArrayList<>();
            ArrayList<String>ans=new ArrayList<>();
             permutation(al,s,"");
            Collections.sort(al);
            ans.add(al.get(0));

            for(int i=1;i<al.size();i++) {
                if(!((al.get(i-1)).equals(al.get(i)))) {
                    ans.add(al.get(i));
                }
            }


            System.out.print(ans.get(k-1)+" ");

        }
        public static void permutation(ArrayList<String> al,String s,String ans) {
            if(s.length()==0) {
                al.add(ans);
                return;
            } for(int i=0;i<s.length();i++) {
                char ch=s.charAt(i);
                String res=s.substring(0,i)+s.substring(i+1);
                permutation(al,res,ans+ch);
            }
        }
}
