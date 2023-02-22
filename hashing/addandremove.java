package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class addandremove {
    public static void main(String[] args) {
        Scanner sv=new Scanner(System.in);
        int n=sv.nextInt();
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++) {
            hash.put(sv.nextInt(), sv.nextInt());
        }
        int remove1=sv.nextInt();
        if(hash.containsKey(remove1))
        {
            hash.remove(remove1);
        }
        System.out.println(hash+" ");
    }
}
