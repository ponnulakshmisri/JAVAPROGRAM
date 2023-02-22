package normal;

import java.util.*;
public class per{
        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            boolean [] visited = new boolean[nums.length];
            FindAllPermutation(res,nums, new ArrayList(),visited);
            return res;
        }
        static void FindAllPermutation(List<List<Integer>> res, int[] nums, List<Integer> curr, boolean[] visited){
            if(curr.size()==nums.length){
                res.add(new ArrayList(curr));
                return;
            }

            for(int i =0;i<nums.length;i++){
                if(visited[i]==true)
                    continue;
                curr.add(nums[i]); //1
                visited[i]= true;
                FindAllPermutation(res,nums,curr,visited);
                curr.remove(curr.size()-1);
                visited[i]=false;
            }
        }
        public static void main(String args[])
        {
            Scanner sv=new Scanner(System.in);
            int n=sv.nextInt();
            int k=sv.nextInt();
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
            {
                a[i]=i;
            }

            ArrayList<String>al=new ArrayList<>();
            ArrayList<String>ans=new ArrayList<>();
           // permutation(al,s,"");
           permute(a);

            Collections.sort(al);
            ans.add(al.get(0));

            for(int i=1;i<al.size();i++) {
                if(!((al.get(i-1)).equals(al.get(i)))) {
                    ans.add(al.get(i));
                }
            }


            System.out.print(ans.get(k-1)+" ");

        }
}
/*
for(int i=0;i<n;i++)//i=1 2
{
for(int j=1;j<n;j++)
{
int tem=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
 */