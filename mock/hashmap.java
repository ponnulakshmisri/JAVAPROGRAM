package mock;

import java.util.HashMap;
import java.util.Scanner;
/*
1)Create hashmap add values and delete values in hashmap runtime
 */
public class hashmap {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(sv.nextInt(),sv.nextInt());
        }
        System.out.println(map);
        int deletevalue=sv.nextInt();
        for (int i = 0; i < n; i++) {
            if(map.containsValue(deletevalue))
            {
                map.remove(deletevalue);
            }
        }
        System.out.println(map);
    }
}
