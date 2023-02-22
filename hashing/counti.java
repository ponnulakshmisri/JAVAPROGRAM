package hashing;

import java.util.HashMap;

public class counti {
    public static void main(String args[])
    {
       // String name="aaabnv";
        String[] name={"HAAI","HELLO"};


        for(int j=0;j<name.length;j++) {
            HashMap<Character,Integer> map=new HashMap<>();
            for (int i = 0; i < name[j].length(); i++) {
                if (!map.containsKey(name[j].charAt(i))) {
                    map.put(name[j].charAt(i), i);
                    System.out.print(name[j].charAt(i));
                }
            }
            System.out.println();
        }
    }
}
