package normal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicatehash {
        public static void main (String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            countDuplicates(arr,n);
        }
        public static void countDuplicates(int[] arr, int n){
            HashMap<Integer,Integer> hmap = new HashMap<>(); // <key,value>
            for(int i=0;i<n;i++){
                int key = arr[i];
                if(hmap.containsKey(key)){
                    int count = hmap.get(key);
                    count++;
                    hmap.put(key,count);
                }else{
                    hmap.put(key,1);
                }
            }
            for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
                if(entry.getValue()>1){
                    System.out.println(entry.getKey()+" "+entry.getValue());
                }
            }
        }
}
