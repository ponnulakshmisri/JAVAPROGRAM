package normal;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        int a[]={2,7,11,15};
        int target=17;
        HashMap<Integer,Integer> hmap =new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++)
        {
            int sum=target-a[i];
            if(hmap.containsKey(sum))
            {
                System.out.println(sum+" "+a[i]);
            }
            else
            {
                hmap.put(a[i],i);
            }
        }
    }
}
