package Array;

import java.util.*;
public class findxposition {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int m = sv.nextInt();
        while (m-- > 0) {
            int n = sv.nextInt();
            int target = sv.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sv.nextInt();
            }
            ArrayList<Integer> ans = findelement(a, target);
            if (ans.size() != 0) {
                for (int i = 0; i < ans.size(); i++) {
                    System.out.print(ans.get(i) + " ");
                }
            }
            else {
                System.out.println("NotFound");
            }
        }
    }
    public static ArrayList<Integer> findelement(int a[],int target)
    {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                list.add(i);
            }
        }
        return list;
    }
}
